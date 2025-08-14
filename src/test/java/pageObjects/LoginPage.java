package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='RememberMe']")
	WebElement rememberme;
	
	@FindBy(xpath="//button[text()=\"Log in\"]")
	WebElement login_btn;
	
	public void EnterEmail(String e) {
		email.sendKeys(e);
	}
	
	public void EnterPassword(String p) {
		password.sendKeys(p);
	}
	
	public void ClickRememberMe() {
		rememberme.click();
	}
	
	public void ClickLogin() {
		login_btn.click();
	}
}
