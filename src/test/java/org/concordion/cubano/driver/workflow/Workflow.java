package org.concordion.cubano.driver.workflow;

import org.concordion.cubano.driver.ui.westpac.FXTravelMigrantPage;
import org.concordion.cubano.driver.BrowserBasedTest;

public class Workflow {
	private final BrowserBasedTest test;

	public Workflow(BrowserBasedTest test) {
		this.test = test;
	}

	public FXTravelMigrantPage openCurrencyConverter() {
		return FXTravelMigrantPage.open(test);
	}
}
