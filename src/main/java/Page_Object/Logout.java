package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public WebDriver Driver;
@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")	
private WebElement profileLogoOption;
	
@FindBy(xpath="//a[normalize-space()='Logout']")
private WebElement LogoutOption;

public Logout(WebDriver Driver) {
	this.Driver=Driver;
	PageFactory.initElements(Driver, this);
}

public WebElement profileLogo() {
	return profileLogoOption;
}

public WebElement LogoutOption() {
	return LogoutOption;
}
}
