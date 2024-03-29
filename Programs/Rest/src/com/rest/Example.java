package com.rest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Example {

	@Test
	public void GetWeatherDetails() {
		// RestAssured.baseURI =
		// "https://http-hunt.thoughtworks-labs.net/challenge/input";

		RestAssured.baseURI = "https://http-hunt.thoughtworks-labs.net/challenge/input";

		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("userId", "Q-_hTQIU");

		Response response = httpRequest.request(Method.GET);

		String responseBody = response.getBody().asString();

		System.out.println(responseBody);

		// System.out.println(response.jsonPath().getString("text").split("[?.]+").length);
		String str = response.jsonPath().getString("text");
		
		
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) 
		{
			if (isVowel(str.charAt(i))) 
			{
				char ch =Character.toLowerCase(str.charAt(i));
				if(hashMap.containsKey(ch))
				{
					hashMap.put(ch, hashMap.get(ch)+1);
				}
				else
				{
					hashMap.put(ch, 1);
				}
			}
		}
		//System.out.println(hashMap);
		
		
		
		
		
		

		// Map<String, Map<String, String>> input =
		// response.jsonPath().getMap("sampleInput");

		// HashMap<String, String> temp = (HashMap<String, String>)
		// input.get("input");

		// System.out.println(temp.get("text"));

		// System.out.println(temp.get("text").split("\\s+").length);

		RestAssured.baseURI = "https://http-hunt.thoughtworks-labs.net/challenge/output";
		RequestSpecification request = RestAssured.given();

		request.header("content-type", "application/json");
		request.header("userId", "Q-_hTQIU");

		JSONObject requestParams = new JSONObject();
		requestParams.put("a", hashMap.get('a'));
		requestParams.put("e", hashMap.get('e'));
		requestParams.put("i", hashMap.get('i'));
		requestParams.put("o", hashMap.get('o'));
		requestParams.put("u", hashMap.get('u'));

		// requestParams.put("count", temp.get("text").length()); // Cast

		// JSONArray array = new JSONArray();
		// array.add(requestParams);

		// JSONObject mainObj = new JSONObject();
		// mainObj.put("output", array);

		request.body(requestParams.toJSONString());
		Response response1 = request.post();

		int statusCode = response1.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		// System.out.println("Response body: " + response1.body().asString());

	}
	
	static boolean isVowel(char ch) 
	{ 
		ch = Character.toUpperCase(ch); 
		return (ch=='A' || ch=='E' || ch=='I' || 
						ch=='O' || ch=='U'); 
	} 
	
	
}