package com.ripple.v1;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class PostCenterTest {

	public static void main(String[] args)
	{
		try {

			// Test getPosts api
			Client getClient = Client.create();

			WebResource getWebResource = getClient
			   .resource("http://localhost:8080/Ripple/api/v1/getPosts/1/1/1/1");

			ClientResponse getResponse = getWebResource.accept("application/json")
	                   .get(ClientResponse.class);

			if (getResponse.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ getResponse.getStatus());
			}

			String getOutput = getResponse.getEntity(String.class);

			System.out.println("Output from calling get api .... \n");
			System.out.println(getOutput);
			
			
			// Test post api
//			Client postClient = Client.create();
//			WebResource postWebResource = postClient
//			   .resource("http://localhost:8080/api/v1/post");
//
//			String input = "{\"timestamp\":1503379682697,\"location\":{\"latitude\":15.0,\"longtitude\":20.0},\"content\":\"first post\"}";
//			ClientResponse postResponse = postWebResource.type("application/json")
//			   .post(ClientResponse.class, input);
//
//			if (postResponse.getStatus() != 201) {
//				throw new RuntimeException("Failed : HTTP error code : "
//				     + postResponse.getStatus());
//			}
//
//			System.out.println("Output from calling post api .... \n");
//			String postOutput = postResponse.getEntity(String.class);
//			System.out.println(postOutput);
//
		  } catch (Exception e) {

			e.printStackTrace();

		  }
	}		
}
