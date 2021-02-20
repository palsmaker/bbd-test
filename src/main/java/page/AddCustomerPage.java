package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage {
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement CUSTOMER_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement ADD_CUSTOMER_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'List Customers')]")
	WebElement LIST_CUSTOMERS_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Groups')]")
	WebElement GROUP_DROPDOWN_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULLNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_DROPDOWN_LOCATER;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement Email;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement Address;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement City;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement State;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//span[@id='select2-country-container']")
	WebElement Country1;
	@FindBy(how = How.XPATH, using = "//input[@class='select2-search__field']")
	WebElement Tags;
	@FindBy(how = How.XPATH, using = "//select[@id='currency']")
	WebElement Currency;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")
	WebElement Group;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@id='cpassword']")
	WebElement ConfirmPassword;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//div[@class='ibox-title']/a")
	WebElement importContact;

	//Methods to interact with the elements
	public void clickCustomerButton() throws InterruptedException {
		BasePage.waitForElement(driver, 60, By.xpath("//span[contains(text(),'Customers')]"));
		CUSTOMER_BUTTON_LOCATOR.click();
	}
	public void clickAddCustomerButton() {
		BasePage.waitForElement(driver, 60, By.xpath("//a[contains(text(),'Add Customer')]"));
		ADD_CUSTOMER_BUTTON_LOCATOR.click();
	}
	String enteredName;
	public void insertFull_name(String fullName) {
		BasePage.waitForElement(driver, 60, By.xpath("//input[@id='account']"));
		String enteredName = fullName + BasePage.randomNumGenerator1("//input[@id='account']", "Full Name");
		FULLNAME_FIELD_LOCATOR.sendKeys(enteredName);
	}
	
	public void Company_Element(String company) {
		BasePage.dropDown(COMPANY_DROPDOWN_LOCATER, company);
	}

	public void emailElement(String email) {
		String emailElement = BasePage.randomNumGenerator1("//input[@id='email']", "Email") + email;
		Email.sendKeys(email);
	}
	public void Zip_Element(String zip) {
		String Zip_Element = zip+BasePage.randomNumGenerator1("//input[@id='zip']", "Zip");
		ZIP_FIELD_LOCATOR.sendKeys(zip);
	}
	public void insertGroup(String group) {
		BasePage.dropDown(GROUP_DROPDOWN_LOCATOR, group);
	}
	public void clickOnSaveButton() {
		SAVE_BUTTON_LOCATOR.click();
		BasePage.waitForElement(driver, 3, By.xpath("//*[@id\"summary\"]"));
	}
	
	public void clickOnListCustomersButton() {
		LIST_CUSTOMERS_BUTTON_LOCATOR.click();
	}
	public void Phone_Element(String phone) {
		String Phone_Element = BasePage.randomNumGenerator1("//input[@id='phone']", "Phone") + phone;
		Phone.sendKeys(phone);
	}


	public void City_Element(String city) {
		City.sendKeys(city);
	}

	public void StateELement(String state) {
		State.sendKeys(state);
	}
	public void CurrencyElement(String currency) {
		BasePage.dropDown(Currency, currency);
		Currency.sendKeys(currency);
	}

	public void Group_Element(String group) {
		Group.sendKeys(group);
	}

	public void PasswordElement(String password) {
		Password.sendKeys(password);
	}

	public void ConfirmPasswordElement(String confirmpassword) {
		ConfirmPassword.sendKeys(confirmpassword);
	}

	public void importContactElement() {
		importContact.click();
	}
	public void Country_Element(String country) {
		BasePage.dropDown(Country1,country );
		Country1.sendKeys(country);
	}

		
	
	//tbody/tr[1]/td[3]
	//tbody/tr[2]/td[3]
	//tbody/tr[3]/td[3]
	//tbody/tr[1]/td[3]/following - sibling::td[4]/a[2] -  Delete Button
	
	//Checking a dynamic web table and verify the data of the table
	String before_xpath = "//tbody/tr[";
	String after_xpath = "]td[3]";
	
	public void verifyEnteredCustomerAndDelete() {
		
		for(int i = 1; i <=5; i++) { //tbody/tr[i]/td[3]
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);
			//Assert.assertEquals(name, enteredName, "Name doesn't match!");
			
			//delete the data, can use only if as well to verify the data
			if(name.contains(enteredName)){
				System.out.println("Entered name exists");
				driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[3]/following-sibling::td[4]/a[2]")).click();
				BasePage.waitForElement(driver,2,By.xpath("/html/body/div[1]/div/div/div[2]/button[2]"));
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")).click();
			}
		
		}
	}
	
	
public int randomNumGenerator() {
	Random rnd = new Random();
	int randomNum = rnd.nextInt(999);
	return randomNum;
}

	
	
	




	
	

	
	

	
	}

