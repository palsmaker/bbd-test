package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
	WebDriver driver;
	
	//Connecting the relationship with the driver to come on the page 
	//Build the constructor and you will pass a parameter to call
	public LoginPage(WebDriver driver) {
	this.driver = driver;
	}
	
	//Element Library
	//WebElement USERNAME_FIELD = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	//By USERNAME_FIELD_LOCATOR = By.xpath("//*[@id=\"username\"]"));
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_FIELD;
	@FindBy(how = How.NAME, using = "login") WebElement SIGNIN_BUTTON_FIELD;
	
	
	//Methods to interact with the elements
	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys("demo@techfios.com");
	}
	
	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys("abc123");
	}
		
	public void clickSignInButton() {
		SIGNIN_BUTTON_FIELD.click();
	}
	
	//OR
	
	/*public void login(String userName, String password){
		USERNAME_FIELD.sendKeys("userName");
		PASSWORD_FIELD.sendKeys("password");
		SIGNIN_BUTTON_FIELD.click();
	}*/
		
}
