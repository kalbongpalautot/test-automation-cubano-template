package org.concordion.cubano.specification.service;

import java.io.IOException;

import org.concordion.cubano.driver.json.RestJsonHelper;
import org.concordion.cubano.specification.ConcordionFixture;

public class RestRequestFixture extends ConcordionFixture {

	public String callService() throws IOException {
		RestJsonHelper restJsonHelper = workflow().restExample().getIPAddress();

		String ipAddress = restJsonHelper.getIpAddress();

		return ipAddress;
	}
}
