package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

    public class DashBoardPage extends BasePage {
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
	WebElement Dashboard_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement Customers_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Companies')]")
	WebElement Companies_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Transactions')]")
	WebElement Transactions_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Sales')]")
	WebElement Sales_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Orders')]")
	WebElement orders_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Documents')]")
	WebElement Documents_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Calendar')]")
	WebElement Calendar_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement Bank_Cash_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Products & Services')]")
	WebElement Product_services_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reports ')]")
	WebElement Reports_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Utilities ')]")
	WebElement Utilities_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Appearance ')]")
	WebElement Appearence_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Plugins')]")
	WebElement Plugins_Locator;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Settings ')]")
	WebElement Settings_Locator;

	public void Dash_Element() {
		Dashboard_Locator.click();
	}

	public void Customers_Element() {
		Customers_Locator.click();
	}

	public void Companies_Element() {
		Companies_Locator.click();
	}

	public void Transactions_Element() {
		Transactions_Locator.click();
	}

	public void Sales_Element() {

		Sales_Locator.click();

	}

	public void orders_Element() {
		orders_Locator.click();
	}

	public void documents_Element() {
		Documents_Locator.click();
	}

	public void Calendar_Element() {
		Calendar_Locator.click();
	}

	public void Bank_cash_Element() {
		Bank_Cash_Locator.click();
	}

	public void Product_services_Element() {
		Product_services_Locator.click();
	}

	public void Reports_Element() {
		Reports_Locator.click();
	}

	public void Utilities_Element() {
		Utilities_Locator.click();
	}

	public void Apperence_Element() {
		Appearence_Locator.click();
	}

	public void plugins_Element() {
		Plugins_Locator.click();
	}

	public void Settings_Element() {
		Settings_Locator.click();
	}

	//public String getPageTitle() {
		//return null;
	
}
