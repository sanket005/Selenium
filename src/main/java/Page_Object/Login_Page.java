package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	public WebDriver driver;
@FindBy(xpath="//input[@name='username']")
private WebElement EmailInput;
@FindBy(xpath="//input[@name='password']")
private WebElement PasswordInput;
@FindBy(xpath="//button[@type='submit']")
private WebElement LoginButton;
	
public Login_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement EmailInput() {
	return EmailInput;
}
public WebElement PasswordInput() {
	return PasswordInput;
}
public WebElement LoginButton() {
	return LoginButton;
}
}
