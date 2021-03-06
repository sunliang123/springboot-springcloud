package com.fengmangbilu.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.Asserts;
import org.apache.http.util.EntityUtils;

/**
 * @author Justice
 */
public class HttpUtils {
	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
	private static CloseableHttpClient httpClient = null;
	private static RequestConfig requestConfig = null;
	private static PoolingHttpClientConnectionManager pool = null;
	private static final int MAX_HTTP_TOTAL_CONNECTION = 100;
	private static final int MAX_CONNECTION_PER_HOST = 50;
	private static final int HTTP_CONNECT_TIMEOUT = 2000;
	private static final int HTTP_CONNECTION_REQUEST_TIMEOUT = 1000;
	private static final int HTTP_SOCKET_TIMEOUT = 2000;
	private static HttpUtils _instance = null;
	private CloseableHttpResponse lastResponse = null;

	static {
		requestConfig = RequestConfig.custom().setConnectTimeout(HTTP_CONNECT_TIMEOUT)
				.setConnectionRequestTimeout(HTTP_CONNECTION_REQUEST_TIMEOUT).setSocketTimeout(HTTP_SOCKET_TIMEOUT).build();
		pool = new PoolingHttpClientConnectionManager();
		pool.setMaxTotal(MAX_HTTP_TOTAL_CONNECTION);
		pool.setDefaultMaxPerRoute(MAX_CONNECTION_PER_HOST);
		httpClient = HttpClients.custom().setConnectionManager(pool).setDefaultRequestConfig(requestConfig).build();
	}

	public static HttpUtils getInstance() {
		if (_instance == null)
			_instance = new HttpUtils();
		return _instance;
	}

	public String doGet(String address) {
		Asserts.notNull(httpClient, "the client has been closed");
		return doGet(address, null);
	}

	public String doGet(String address, Map<String, String> headers) {
		Asserts.notNull(httpClient, "the client has been closed");
		try {
			HttpGet get = new HttpGet(address);
			get.setHeader("Connection", "close");
			if (headers != null) {
				for (String key : headers.keySet()) {
					get.setHeader(key, headers.get(key));
				}
			}
			lastResponse = httpClient.execute(get);
			int statusCode = lastResponse.getStatusLine().getStatusCode();
			String responseContent = getLastResponseAsString();
			if (statusCode == 200) {
				return responseContent;
			}
		} catch (IOException ex) {
			Logger.getLogger(HttpUtils.class.getName()).log(Level.SEVERE, null, ex);
		}
		throw new IllegalStateException("Unable to execute get request.");
	}

	public String doPost(String address, Map<?, ?> params) {
		Asserts.notNull(httpClient, "the client has been closed");
		try {
			HttpPost post = new HttpPost(address);
			post.setHeader("Connection", "close");

			List<NameValuePair> postParams = new ArrayList<>();
			for (Object key : params.keySet()) {
				postParams.add(new BasicNameValuePair((String) key, (String) params.get(key)));
			}

			UrlEncodedFormEntity paramEntity = new UrlEncodedFormEntity(postParams, DEFAULT_CHARSET);
			post.setEntity(paramEntity);

			lastResponse = httpClient.execute(post);
			int statusCode = lastResponse.getStatusLine().getStatusCode();
			String responseContent = getLastResponseAsString();
			if (statusCode == 200) {
				return responseContent;
			}
		} catch (UnsupportedEncodingException ex) {
			Logger.getLogger(HttpUtils.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(HttpUtils.class.getName()).log(Level.SEVERE, null, ex);
		}
		throw new IllegalStateException("Unable to execute post request.");
	}

	public String doPost(String address, String postDataXML) {
		Asserts.notNull(httpClient, "the client has been closed");
		try {
			HttpPost post = new HttpPost(address);
			post.setHeader("Connection", "close");
			post.addHeader("Content-Type", "text/xml");

			StringEntity postEntity = new StringEntity(postDataXML, DEFAULT_CHARSET);
			post.setEntity(postEntity);

			lastResponse = httpClient.execute(post);
			int statusCode = lastResponse.getStatusLine().getStatusCode();
			String responseContent = getLastResponseAsString();
			if (statusCode == 200) {
				return responseContent;
			}
		} catch (UnsupportedEncodingException ex) {
			Logger.getLogger(HttpUtils.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(HttpUtils.class.getName()).log(Level.SEVERE, null, ex);
		}

		throw new IllegalStateException("Unable to execute post request.");

	}

	public String getLastResponseAsString() {
		try {
			String result = EntityUtils.toString(lastResponse.getEntity(), "UTF-8");
			EntityUtils.consume(lastResponse.getEntity());
			lastResponse.close();
			lastResponse = null;
			return result;
		} catch (IOException ex) {
			Logger.getLogger(HttpUtils.class.getName()).log(Level.SEVERE, null, ex);
		}
		throw new IllegalStateException("Unable to get last response as String.");
	}

	public void dropLastResponse() {
		if (lastResponse != null) {
			try {
				lastResponse.close();
				lastResponse = null;
			} catch (IOException ex) {
				Logger.getLogger(HttpUtils.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	public boolean isLastResponseOK(int lastResponseCode) {
		return lastResponseCode == 200;
	}

	public void dispose() {
		try {
			httpClient.close();
			httpClient = null;
		} catch (IOException ex) {
			Logger.getLogger(HttpUtils.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
