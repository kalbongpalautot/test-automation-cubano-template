package org.concordion.cubano.driver.ui.westpac;

import org.concordion.cubano.AppConfig;
import org.concordion.cubano.driver.BrowserBasedTest;
import org.concordion.cubano.driver.ui.PageObject;
import org.concordion.cubano.driver.web.ChainExpectedConditions;
import org.concordion.cubano.driver.web.PageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ru.yandex.qatools.htmlelements.element.Select;

public class FXTravelMigrantPage extends PageObject<FXTravelMigrantPage> {
	private static final String TITLE = "Currency converter";

	@FindBy(css = "#main")
	WebElement currentPage;

	@FindBy(css = "#container")
	CurrencyConverterComponent currencyConverterComponent;

	public FXTravelMigrantPage(BrowserBasedTest test) {
		super(test);
	}

	@Override
	public ExpectedCondition<?> pageIsLoaded(Object... params) {
		return ChainExpectedConditions.with(ExpectedConditions.textToBePresentInElement(currentPage, TITLE))
				.and(ExpectedConditions.frameToBeAvailableAndSwitchToIt("westpac-iframe"))
				.and(ExpectedConditions.elementToBeClickable(currencyConverterComponent.getConvert()));
	}

	public static FXTravelMigrantPage open(BrowserBasedTest test) {
		test.getBrowser().getDriver().navigate().to(AppConfig.getInstance().getWestpacUrl());

		return new FXTravelMigrantPage(test);
	}

	public FXTravelMigrantPage convertCurreny(String fromCurrency, String money, String toCurrency) {
		String iframe = "westpac-iframe";

		// switch to the iframe
		if (!PageHelper.getCurrentFrameNameOrId(getBrowser().getDriver()).equalsIgnoreCase(iframe)) {
			getBrowser().getDriver().switchTo().frame(iframe);
		}

		selectOptions(currencyConverterComponent.getConvertFrom(), fromCurrency);
		currencyConverterComponent.getAmount().sendKeys(money);
		selectOptions(currencyConverterComponent.getConvertTo(), toCurrency);

		// after clicking need to refresh and load the elements again
		capturePage(currencyConverterComponent.getConvert());
		currencyConverterComponent.getConvert().click();
		currencyConverterComponent = getBrowser().getHtmlElementsLoader(this)
				.findElement(CurrencyConverterComponent.class, By.cssSelector("#container"));

		return this;
	}

	public String getMessage() {
		capturePage(currencyConverterComponent.getMessage(), "Currency Converter");

		return currencyConverterComponent.getMessage().getText();
	}

	public String getErrorMessage() {
		capturePage(currencyConverterComponent.getErrorMessage());

		return currencyConverterComponent.getErrorMessage().getText();
	}

	// need to use "Select" instead as apparently WebElement does not work properly
	// on this html object using Gecko Driver
	private void selectOptions(WebElement element, String fromCurrency) {
		capturePage(element);
		new Select(element).selectByVisibleText(fromCurrency);
	}
}
