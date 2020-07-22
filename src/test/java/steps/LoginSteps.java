package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps {
	
	WebDriver driver;
	LoginPage login;
	
	//Create a marking - calling Login class and enter details
		@Given("^I am on Techfios site$")
		public void I_am_on_Techfios_site() throws Throwable {
			driver = BrowserFactory.init();
			login = PageFactory.initElements(driver, LoginPage.class);
		}
	
	    @When("^I enter username and password$")
	    public void I_enter_username_and_password() throws Throwable {
	    login.enterUserName("demo@techfios.com");
	    Thread.sleep(3000);
	    login.enterPassword("abc123");  
	    Thread.sleep(3000);
	}
	    
	    @When("^I click on sign in button$")
	    public void I_click_on_sign_in_button() throws Throwable {
	    	login.clickSignInButton();
	    	throw new PendingException();
	    }
	    
	    @Then("^Dashboard page should display$")
	    public void dashboard_page_should_display() throws Throwable {
	   
	    }
}

	
