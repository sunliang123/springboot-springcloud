package com.fengmangbilu.util;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class SystemClock {
	private final long precision;
	private final AtomicLong now;

	public SystemClock(long precision) {
		this.precision = precision;
		now = new AtomicLong(System.currentTimeMillis());
		scheduleClockUpdating();
	}

	private static class InstanceHolder {
		public static final SystemClock INSTANCE = new SystemClock(1);
	}

	private static SystemClock instance() {
		return InstanceHolder.INSTANCE;
	}

	private void scheduleClockUpdating() {
		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
			@Override
			public Thread newThread(Runnable runnable) {
				Thread thread = new Thread(runnable, "System Clock");
				thread.setDaemon(true);
				return thread;
			}
		});
		scheduler.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				now.set(System.currentTimeMillis());
			}
		}, precision, precision, TimeUnit.MILLISECONDS);
	}

	public static long now() {
		return instance().now.get();
	}
	
	public static Date newDate() {
		return new Date(now());
	}

	public long precision() {
		return precision;
	}
}
