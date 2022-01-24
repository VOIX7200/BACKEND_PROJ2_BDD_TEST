package com.qa.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class RestClient {
	
	String percentage;
	public String getPercentage(int amt) throws ClientProtocolException, IOException {
	CloseableHttpClient httpclient= HttpClients.createDefault();
	//String url = "http://localhost:8088/REST_PROJEA2/webapi/disc/";
	String url = "http://localhost:8081/REST_PROJEA3X_2A/webapi/disc/";
	HttpGet httpget = new HttpGet(url+amt);
	
	CloseableHttpResponse  closeablehttpreponse= httpclient.execute(httpget);
	int statusCode = closeablehttpreponse.getStatusLine().getStatusCode();
	String response =	EntityUtils.toString(closeablehttpreponse.getEntity(), "UTF-8");
	System.out.println("print statusCode "+ statusCode );
	 
	JsonObject jobj = (JsonObject)JsonParser.parseString(response);
	System.out.println("response json object " + jobj );
	  return percentage  = jobj.get("discountPercentage").toString();
		
	}

}
