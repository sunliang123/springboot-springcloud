package com.fengmangbilu.microservice.oa.providers;

import java.util.Map;

import com.fengmangbilu.microservice.oa.endpoints.ReportRequest;
import com.fengmangbilu.microservice.oa.enums.Provider;

public interface ProviderStrategy {
	public Map<String, String> getParams(ReportRequest request) throws Exception;

	public String getAreaName();

	public Provider getProvider();
}
