package com.fengmangbilu.util;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.NetworkInterface;

import org.springframework.util.StringUtils;

public class IdWorker {

	private long workerId;
	private long datacenterId;
	private long sequence = 0L;
	
	private long twepoch = 1514764800000L;
	
	private long workerIdBits = 5L;
	private long datacenterIdBits = 5L;
	private long maxWorkerId = -1L ^ (-1L << workerIdBits);
	private long maxDatacenterId = -1L ^ (-1L << datacenterIdBits);
	private long sequenceBits = 12L;

	private long workerIdShift = sequenceBits;
	private long datacenterIdShift = sequenceBits + workerIdBits;
	private long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits;
	private long sequenceMask = -1L ^ (-1L << sequenceBits);

	private long lastTimestamp = -1L;
	
	public IdWorker() {
        this.datacenterId = getDatacenterId(maxDatacenterId);
        this.workerId = getMaxWorkerId(datacenterId, maxWorkerId);
    }

	public IdWorker(long workerId, long datacenterId) {
		// sanity check for workerId
		if (workerId > maxWorkerId || workerId < 0) {
			throw new IllegalArgumentException(
					String.format("worker Id can't be greater than %d or less than 0", maxWorkerId));
		}
		if (datacenterId > maxDatacenterId || datacenterId < 0) {
			throw new IllegalArgumentException(
					String.format("datacenter Id can't be greater than %d or less than 0", maxDatacenterId));
		}
		this.workerId = workerId;
		this.datacenterId = datacenterId;
	}

	public synchronized long nextId() {
		long timestamp = timeGen();

		if (timestamp < lastTimestamp) {
			throw new RuntimeException(String.format(
					"Clock moved backwards.  Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
		}

		if (lastTimestamp == timestamp) {
			sequence = (sequence + 1) & sequenceMask;
			if (sequence == 0) {
				timestamp = tilNextMillis(lastTimestamp);
			}
		} else {
			sequence = 0;
		}

		lastTimestamp = timestamp;
		return ((timestamp - twepoch) << timestampLeftShift) | (datacenterId << datacenterIdShift)
				| (workerId << workerIdShift) | sequence;
	}

	private long tilNextMillis(long lastTimestamp) {
		long timestamp = timeGen();
		while (timestamp <= lastTimestamp) {
			timestamp = timeGen();
		}
		return timestamp;
	}

	private long timeGen() {
		return SystemClock.now();
	}

	protected static long getDatacenterId(long maxDatacenterId) {
		long id = 0L;
		try {
			InetAddress ip = InetAddress.getLocalHost();
			NetworkInterface network = NetworkInterface.getByInetAddress(ip);
			if (network == null) {
				id = 1L;
			} else {
				byte[] mac = network.getHardwareAddress();
				if (null != mac) {
					id = ((0x000000FF & (long) mac[mac.length - 1])
							| (0x0000FF00 & (((long) mac[mac.length - 2]) << 8))) >> 6;
					id = id % (maxDatacenterId + 1);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return id;
	}

	protected static long getMaxWorkerId(long datacenterId, long maxWorkerId) {
		StringBuilder mpid = new StringBuilder();
		mpid.append(datacenterId);
		String name = ManagementFactory.getRuntimeMXBean().getName();
		if (!StringUtils.isEmpty(name)) {
			// GET jvmPid
			mpid.append(name.split("@")[0]);
		}
		// MAC + PID 的 hashcode 获取16个低位
		return (mpid.toString().hashCode() & 0xffff) % (maxWorkerId + 1);
	}

}
