package com.fengmangbilu.microservice.oa.providers;

import java.util.ArrayList;
import java.util.List;

import com.fengmangbilu.microservice.oa.endpoints.ReportRequest;
import com.fengmangbilu.microservice.oa.providers.support.Condition;
import com.fengmangbilu.microservice.oa.providers.support.Conditions;
import com.fengmangbilu.microservice.oa.providers.support.Item;

public class DefaultCreditProfile implements ICreditProfile {
	
	private final static String PARAM_NAME = "name";

	private final static String PARAM_DOCUMENT_NO = "documentNo";

	private static DefaultCreditProfile profile;

	private Conditions conditions;

	private ReportRequest request;

	public DefaultCreditProfile(ReportRequest request) {
		this.request = request;
		this.conditions = new Conditions();
	}

	public static DefaultCreditProfile getProfile(ReportRequest request) {
		profile = new DefaultCreditProfile(request);
		return profile;
	}

	@Override
	public Conditions getConditions() {
		Condition condition = new Condition();
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(PARAM_NAME, request.getName()));
		items.add(new Item(PARAM_DOCUMENT_NO, request.getIdCard()));
		condition.setItems(items);
		conditions.setCondition(condition);
		return conditions;
	}

}
