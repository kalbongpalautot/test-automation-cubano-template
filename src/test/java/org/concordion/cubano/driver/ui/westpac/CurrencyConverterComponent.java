package org.concordion.cubano.driver.ui.westpac;

import org.concordion.cubano.driver.web.pagefactory.WebDriverAware;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class CurrencyConverterComponent extends HtmlElement implements WebDriverAware {
	private WebDriver driver;

	@FindBy(id = "ConvertFrom")
	private WebElement convertFrom;

	@FindBy(id = "Amount")
	private WebElement amount;

	@FindBy(id = "ConvertTo")
	private WebElement convertTo;

	@FindBy(id = "convert")
	private WebElement convert;

	@FindBy(css = "#resultsdiv > em")
	private WebElement message;

	@FindBy(css = "#errordiv")
	private WebElement errorMessage;

	@Override
	public void setWebDriver(WebDriver driver) {
		this.driver = driver;

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getConvertFrom() {
		return convertFrom;
	}

	public WebElement getAmount() {
		return amount;
	}

	public WebElement getConvertTo() {
		return convertTo;
	}

	public WebElement getConvert() {
		return convert;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}

}
