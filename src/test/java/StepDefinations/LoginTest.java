package StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Page_Object.Login_Page;
import Page_Object.Logout;
import Resources.Setup;
import Tests.TestLogin;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends Setup{
	WebDriver driver;
	Logger Log;
	@Before("@LoginTestCase")
	public void Logs() {
		Log = LogManager.getLogger(TestLogin.class.getName());
		
	}
	@After("@LoginTestCase")
	public void CloseBrowser() {
		driver.close();
	}
	@Given("^Open any Browser$")
	public void open_any_browser() {
		
		driver = browserLaunch();
		Log.info("Browser is launched");
		driver.get(prop.getProperty("URL"));
		Log.debug("Entered the URL");
	}

	@When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	public void user_enters_username_as_and_password_as_into_the_fields(String username, String password) {

		Login_Page loginpage = new Login_Page(driver);
		loginpage.EmailInput().sendKeys(username);
		Log.debug("User enters the username");
		loginpage.PasswordInput().sendKeys(password);
		Log.debug("User enters the pasword");
	}

	@And("^User clicks on Login button$")
	public void user_clicks_on_login_button() {
	
		Login_Page loginpage = new Login_Page(driver);
		loginpage.LoginButton().click();
		Log.debug("User clicked on Login button");
	 
	}

	@Then("^Login status should be \"([^\"]*)\"$")
	public void verify_user_is_able_to_successfully_login(String Status) {
		Logout Logout = new Logout(driver);
		String ActualResult=null;
		try {
			Logout.profileLogo().click();
			Utilities.wait.explicitlyWait(driver, Logout.LogoutOption());
			if(Logout.LogoutOption().isDisplayed()) {
				ActualResult="PASS";
				Log.debug("User is logged in succesfully");
			}
		} catch (Exception e) {
			ActualResult="FAIL";
			Log.debug("User is not logged in succesfully");
		}
		Assert.assertEquals(ActualResult,Status);
	}
			
	}

