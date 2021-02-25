package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BasePage;
import page.DashBoardPage;
import page.LoginPage;
import util.Assertion;
import util.BrowserFactory;
import util.Database;

//creating table of contents with statement and executing code in the steps.
//call the browser factory to instantiate the browser

public class LoginSteps extends BasePage {
//based your user level: 4eg, admin & regular user step page with 1normal step page and 1priority step page
//create object method
	WebDriver driver;
	LoginPage login;
	DashBoardPage dashboardPage; 
	Database database;

	// Create a marking - calling Login class and enter details

	/*
	 * @Before public void beforeRun() { driver = BrowserFactory.init(); login =
	 * PageFactory.initElements(driver, LoginPage.class); dashboardPage =
	 * PageFactory.initElements(driver, DashBoardPage.class); }
	 */

	@Given("^I am on Techfios site$")
	public void I_am_on_Techfios_site() throws Throwable {
		driver = BrowserFactory.init();
		login = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashBoardPage.class); 
	}

	@When("^I enter username and password$")
	public void I_enter_username_and_password() throws Throwable {
		//LoginPage.enterUserName("demo@techfios.com");
		//Thread.sleep(3000);
		//LoginPage.enterPassword("abc123");
		//Thread.sleep(3000);
		login.enterUserName(database.get("username"));
		login.enterPassword(database.get("passowrd"));
	}
	//Using parameterizing and not hard coding to enter multiple different data(scenario outline)
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	    		public void I_enter_and(String username, String password) throws Throwable {
	    			login.enterUserName(username);
	    			login.enterPassword(password);
	    			//screenShot(driver,"C:\\Users\\Dhrubajyoti\\Desktop\\TF Pallavi\\Selenium\\Screenshot\\test.jpg");
	}

	@When("^I click on sign in button$")
	public void I_click_on_sign_in_button() throws Throwable {
		login.clickSignInButton();
	}

	@Then("^Dashboard page should display$")
	public void dashboard_page_should_display() throws Throwable {
		String expected = "Dashboard- iBilling";
		Assertion.equals("Wrong Page displayed", dashboardPage.getPageTitle(),expected);
	}

	@After
	public void afterRun() {
		BrowserFactory.tearDown();
	}
}
