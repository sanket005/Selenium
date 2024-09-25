package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Resources.Setup;

public class Testtwo extends Setup {
	WebDriver driver;
	@Test
	public void Test2() {
		System.out.println("test 2 is running");
		driver=browserLaunch();
		driver.get("https://chatgpt.com/");
	}
	@AfterMethod
	public void AfterTest2() {
		driver.close();
	
	}
}
