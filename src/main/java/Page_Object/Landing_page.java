package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing_page {
	WebDriver driver;
@FindBy(xpath="//span[text()='My Account']")
private WebElement MyAccount;
@FindBy(css=".dropdown-menu.dropdown-menu-right>li:nth-child(2)>a")
private WebElement LoginOption;

public Landing_page(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver,this);
}

public WebElement MyAccount() {	
	return MyAccount;
}
public WebElement LoginOption() {
	return LoginOption;
}
}
