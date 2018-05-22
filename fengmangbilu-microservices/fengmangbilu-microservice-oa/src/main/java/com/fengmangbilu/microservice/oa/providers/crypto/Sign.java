package com.fengmangbilu.microservice.oa.providers.crypto;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fengmangbilu.microservice.oa.providers.crypto.DES;
import com.fengmangbilu.microservice.oa.providers.crypto.RSA;

public class Sign {

	private final static String RSA_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCMlPZdONi8DxvsrtMjC6zC/kLaWeK52x0d8hV1D1VtEzzb49E0UKp6wfjwcj4+c07jbdNU42qiRlw8n4QrCU4Av28yaeYJuqGI59icPH5n/YlQV44q7czO5J6aX/4a8PeczFJ1iw+T1NbPbPdiU6tJF+PCQNNNQz/OAr1vdYSQmBBU0cUEkxmGVlUTcsY/n4gNPrsFdFlnvKfm0YyDfLYrj56Myon46FV9YdcVkyqK5UtsalcBBmP5cy+j1FoA5419g21YddiXHaPCAsbl/05BgNeJdt7Tj3mhd8hHLYo3PPvIX1S7es/r1yO/pOsuQnflA2BOvASs31SsozUMtsyhAgMBAAECggEAOiuRXbWeCQL/fQpCF2hHTlBDfXJgHKOMAs4fDtcPdBjXv+0erdULFcyZo3TCSLkR1Y2mOqP3hbozhGpFGEG7YxfTfTrQkwoEuU+mE8/8Ri9k2DfCfgT0EFANSLebv64h52GsZTLreTJCyIXAP5F7eL1H4yNLy9ad2jLMDAjGl8WXQ0l9wN03dCg4wTM86ErJX2YpoUVci4i0U1yc0GdFR17v99iSZasXKX9lk0C6pBoyzoTtGzwmEZRCXXArHFsp0X4ZrtVremIurzHCIEnFkuv5HWykIO1Ii7vmW1JeffdBea8L6h+u/YosfA/vbYpK5/pJOvzh5/anMCu4X//emQKBgQDB76sMSJFGrJ71UakrpxMH3a7aC5KF2UXCm1ajHggkc2XGHLzIwWmiMpertjG/Ok6t6YvSE4BJhlyrU3mlqDrA0H5iRVhvbwRw3Vj+WnpnthTHG2DbqLhQ7EOpbedacpepZmiKzKycZe9o3Nyuj/jnltvlqy2ZC53TwnO0JcwO4wKBgQC5kjY2b+QQpu5TkM/LsILRduC760wMriclX9y19NUqIpwAvXVeTMJXVrxbkXeuJMvxp5NIwRrs80OkQzCKDJpjscJsBFcH7JcouPg88UklLvMw8qXd4e4CY8lx8u0EGDG0BgLlHBDR4XbhoFaBevIfxnfSpcOnpJLUZXdgUSepqwKBgA7qD41yRznYLKFRFmF1B9GjCr9aBHqmqua8a30/4gBrn3gM3bfSp/0BRwi9ijXalhJp04bkWQlOe/HxCXnj5iDN5+pGyvZG42CKpT1qV9+B8Tces+QwpXwTr2BoQ1KBXYh5h7Ck7OFaNX8q/Q2vpMSqpV6UO315lzmhyqQgBAFhAoGAfDbeivnCk1Lp3I3mSdXQ+xyzuZX6xdIc6euM9U75EMcx3Vz0HzcKLyQj2Lc6gRqoWQ1ujRiVSV5cPKus5fshrPHjziHpj6hSVjPaFhD8gSM4Ld9+H1OH2Zmp0dhlxoPbYUFU1r8+kv50cPq+bNU7FQHoWtwSZzjF/94bViF8hxkCgYA59yrFz4fFFM8fuDdOmsm5iyX3JsP3wUPtvjOaQGTBhRILmCN7xJUs9rsPTpO3Vtpljh0gXj2HRhtW/mpNxqx4XAgKmt/5+7jkO23ZyQBr3i7ssAbGHIqJuaf6DOGA9Tzj/JiaG5hs7USykfd5eMQkbA1MX1Mflf9fMA8zLwr5eQ==";

	private final static String KOALA_RSA_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC5ptBi+WZsLh0Ptxq8SKLo4iZSwoBdCCUeIjwlUYBys2vaZ6xbFgvoK42DBO3ecPntWlf67rg8gGFU6sRAcJyiRuMpEaCXoZuPkHErbK0F1WarA+IgLThSuw3FcVTaejWhKgJVVa4chbmSuotNYSLn1a0j69tBkUd13Zi/uhERxwIDAQAB";

	private final static String DES_KEY = "sZ10Zx25";

	private final static String CUSTOMER_ID = "201610210000000001";

	/**
	 * 加密并签名
	 */
	public static Map<String, String> getSign(Map<String, String> reqMap) throws Exception {
		Map<String, String> data = new HashMap<String, String>();
		String reqData = JSON.toJSONString(reqMap);
		DES des = new DES(DES_KEY);
		reqData = des.encrypt(reqData);
		data.put("reqData", reqData);
		data.put("sign", RSA.sign(reqData, RSA_PRIVATE_KEY));
		data.put("customerId", CUSTOMER_ID);
		return data;
	}

	/**
	 * 根据反馈回来的信息，生成签名结果
	 */
	public static JSONObject getSignVeryfy(Map<String, Object> resMap) throws Exception {
		String retData = String.valueOf(resMap.get("retData"));
		boolean isSign = RSA.verify(retData, String.valueOf(resMap.get("sign")), KOALA_RSA_PUBLIC_KEY);
		if (isSign) {
			DES des = new DES(DES_KEY);
			retData = des.decrypt(retData);
			return JSON.parseObject(retData);
		}
		return null;
	}
}
