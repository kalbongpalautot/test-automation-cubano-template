package org.concordion.cubano.driver.json;

import java.io.IOException;

import org.concordion.cubano.driver.http.JsonReader;

public class RestJsonHelper {
	private final JsonReader reader;

	public RestJsonHelper(JsonReader reader) {
		this.reader = reader;
	}

	public String asPrettyString() throws IOException {
		return reader.asPrettyString();
	}

	public String getIpAddress() {
		return reader.getAsString("origin");
	}
}
