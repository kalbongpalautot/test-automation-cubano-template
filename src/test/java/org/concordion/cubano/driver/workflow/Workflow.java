package org.concordion.cubano.driver.workflow;

import org.concordion.cubano.driver.ui.westpac.FXTravelMigrantPage;
import org.concordion.cubano.driver.BrowserBasedTest;
import org.concordion.cubano.driver.services.ExampleRestApi;

public class Workflow {
	private final BrowserBasedTest test;

	public Workflow(BrowserBasedTest test) {
		this.test = test;
	}

	public FXTravelMigrantPage openCurrencyConverter() {
		return FXTravelMigrantPage.open(test);
	}
	
	public ExampleRestApi restExample() {
		return new ExampleRestApi();
	}
}
