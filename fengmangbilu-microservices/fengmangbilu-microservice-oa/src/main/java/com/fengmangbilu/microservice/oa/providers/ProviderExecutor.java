package com.fengmangbilu.microservice.oa.providers;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

import com.fengmangbilu.microservice.oa.endpoints.ReportRequest;
import com.fengmangbilu.microservice.oa.exceptions.ReportException;

public class ProviderExecutor implements Callable<ProviderContext> {
	private final ReportRequest request;
	private CountDownLatch latch;

	public ProviderExecutor(ReportRequest request, CountDownLatch latch) {
		this.request = request;
		this.latch = latch;
	}

	@Override
	public ProviderContext call() throws ReportException {
		try {
			return ProviderContext.getContext().execute(request);
		} finally {
			latch.countDown();
		}
	}
}
