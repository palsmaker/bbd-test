package page;

import java.util.Random;

import org.openqa.selenium.By;

WebDriver driver;

public class AddCustomerPage {



//Methods to interact with the elements
	public void clickCustomerButton() {
		CUSTOMERS_BUTTON_LOCATOR.click();
	}

	public void clickAddCustomerButton() {
		ADD_CUSTOMER_BUTTON_LOCATOR.click();

	}
	String enteredName;
	public void insertFullname(String fullName) {
		String enteredName = fullName + randomNumGenerator();
		FULLNAME_FIELD_LOCATOR.sendKeys(enteredName);
	}
	
	public void insertCompanyName(String company) {
		BasePage.dropDown(COMPANY_DROPDOWN_LOCATER, company);
	}
	public void insertEmail(String email) {
		String enteredEmail = BasePage.randomn
				
	}
	public void insertZip(String zip) {
		ZIP_FIELD_LOCATOR.sendKeys(zip);
	}
	public void insertGroup(String group) {
		BasePage.dropdown(GROUP_DROPDOWN_LOCATOR, group);
	}
	public void clickOnSaveButton() {
		SAVE_BUTTON_LOCATOR.click();
		BasePage.waitForEleemt(driver, 3, By.xpath("//*[@id\"summary\"]"));
	}
	
	public void clickOnListCustomersButton() {
		LIST_CUSTOMERS_BUTTON_LOCATOR.click();
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