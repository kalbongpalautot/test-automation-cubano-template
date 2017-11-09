package org.concordion.cubano.driver.services;

import java.io.IOException;

import org.concordion.cubano.driver.http.HttpEasy;
import org.concordion.cubano.driver.http.JsonReader;
import org.concordion.cubano.driver.json.RestJsonHelper;

public class ExampleRestApi extends ServiceBase {

	// Using a public API found at https://resttesttest.com/
	public RestJsonHelper getIPAddress() throws IOException {
		// NOTE: Base URL has already been set in ConcordionBase using baseUrl from config.properties file

		JsonReader reader = HttpEasy.request()
				.path("/get")
				.queryParam("name", "fred")
				.get()
				.getJsonReader();
				

		// Log response details in both log file and storyboard
		captureAction(Action.JSON_RESPONSE, "Get IP Address", "", reader.asPrettyString());

		return new RestJsonHelper(reader);
	}
	
//	// Using a public API found at https://resttesttest.com/
//		public String getIPAddress() throws IOException {
//			// NOTE: Base URL has already been set in ConcordionBase using baseUrl from config.properties file
//
//			String response = HttpEasy.request()
//					.path("/get")
//					.queryParam("name", "fred")
//					.get()
//					.getJsonReader()
//					.asPrettyString();
//
//			// Log response details in both log file and storyboard
//			captureAction(Action.JSON_RESPONSE, "Get IP Address", "", response);
//
//			return response;
//		}
}
