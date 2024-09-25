package Tests;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page_Object.Login_Page;
import Page_Object.Logout;
import Resources.Setup;
import Resources.data_provider;

public class TestLogin extends Setup {
	public WebDriver driver;
	Logger Log;


	@BeforeMethod
	public void beforeLogin() {
		
		Log = LogManager.getLogger(TestLogin.class.getName());
		driver = browserLaunch();
		Log.info("Browser is launched");
	}

	@Test(dataProvider = "getCredentials", dataProviderClass = data_provider.class)
	public void Login(String username, String password) throws InterruptedException {
		driver.get(prop.getProperty("URL"));
		Log.debug("Entered the URL");
	
		
	//	Landing_page landingpage = new Landing_page(driver);
	//	Thread.sleep(2000);
	//	landingpage.MyAccount().click();
	//	Log.debug("User jumped on My Account");
	//	landingpage.LoginOption().click();
	//	Log.debug("User jumped on Login");
		Login_Page loginpage = new Login_Page(driver);
		loginpage.EmailInput().sendKeys(username);
		Log.debug("User enters the username");
		loginpage.PasswordInput().sendKeys(password);
		Log.debug("User enters the pasword");
		loginpage.LoginButton().click();
		Log.debug("User clicked on Login button");
		Logout Logout = new Logout(driver);
	
	String ActualResult=null;
		try {
			Logout.profileLogo().click();
			Log.debug("User clicked on Profile icon");
			Utilities.wait.explicitlyWait(driver, Logout.LogoutOption());
			if(Logout.LogoutOption().isDisplayed()) {
				ActualResult="PASS";
				Log.debug("User is logged in succesfully");
			}
		} catch (Exception e) {
			ActualResult="FAIL";
			Log.debug("User is not logged in succesfully");
		}
		Assert.assertEquals(ActualResult,"PASS");

	}

	@AfterMethod
	public void AfterLogin() {
		driver.close();
		Log.info("Broser closed");
	}
}
