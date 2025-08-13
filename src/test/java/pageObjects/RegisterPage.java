package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement redioMale;
	
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement redioFemale;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement Company;
	
	@FindBy(xpath="//input[@id='Newsletter']")
	WebElement Newsletter;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement RegisterButton;
	
	public void ClickRedioMale() {
		redioMale.click();
	}
	
	public void ClickRedioFemale() {
		redioFemale.click();
	}
	
	public void EnterFirstName(String name) {
		FirstName.sendKeys(name);
	}
	
	public void EnterLastName(String name) {
		LastName.sendKeys(name);
	}
	
	public void EnterEmail(String email) {
		Email.sendKeys(email);
	}
	
	public void EnterCompanyName(String name) {
		Company.sendKeys(name);
	}
	
	public void ClickNewsletter() {
		Newsletter.click();
	}
	
	public void EnterPassword(String pass) {
		Password.sendKeys(pass);
	}
	
	public void EnterConfirmPassword(String pass) {
		ConfirmPassword.sendKeys(pass);
	}
	
	public void ClickRegisterButton() {
		RegisterButton.click();
	}
	
}
