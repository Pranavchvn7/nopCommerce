package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RegisterPage;
import testBase.BaseClass;

public class ValidateRegistrationTest extends BaseClass{

	@Test
	public void TC_R_001() {
		logger.info("***Staring TestCase TC_R_001***");
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		RegisterPage r=new RegisterPage(driver);
		r.ClickRedioMale();
		logger.info("Clicked Male redio button");
		r.EnterFirstName("Prandfddfdav");
		logger.info("Entered FirstName");
		r.EnterLastName("Chavanfdf");
		logger.info("Entered LastName");
		r.EnterEmail("Pranfdfav@gmail.com");
		logger.info("Entered Email");
		r.ClickNewsletter();
		logger.info("Clicked Newsletter checkbox");
		r.EnterCompanyName("ABC Idfndia Pvt Ltd");
		logger.info("Entered Company name");
		r.EnterPassword("Passwfford123");
		logger.info("Entered Password");
		r.EnterConfirmPassword("Passwfford123");
		logger.info("Entered Confirm Password");
		r.ClickRegisterButton();
		logger.info("Clicked Register button");
		Assert.assertTrue(true);
	}
	
	@Test
	public void TC_R_002() {
		logger.info("***Staring TestCase TC_R_002***");
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		RegisterPage r=new RegisterPage(driver);
		r.ClickRegisterButton();
		logger.info("Clicked Register button");
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='FirstName-error']")).isDisplayed());
	}
	
	@Test
	public void TC_R_003() {
		logger.info("***Staring TestCase TC_R_003***");
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		RegisterPage r=new RegisterPage(driver);
		r.ClickNewsletter();
		logger.info("Clicked Newsletter checkbox");
		r.EnterCompanyName("ABC Idfndia Pvt Ltd");
		logger.info("Entered Company name");
		r.EnterPassword("Passwfford123");
		logger.info("Entered Password");
		r.EnterConfirmPassword("Passwfford123");
		logger.info("Entered Confirm Password");
		r.ClickRegisterButton();
		logger.info("Clicked Register button");
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='FirstName-error']")).isDisplayed());
	}
	
	@Test
	public void TC_R_004() {
		logger.info("***Staring TestCase TC_R_004***");
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		RegisterPage r=new RegisterPage(driver);
		r.ClickRedioMale();
		logger.info("Clicked Male redio button");
		r.EnterFirstName("Prandfddfdav");
		logger.info("Entered FirstName");
		r.EnterLastName("Chavanfdf");
		logger.info("Entered LastName");
		r.EnterEmail("Pranfdfavgmail.com");
		r.ClickNewsletter();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='Email-error']")).isDisplayed());
	}
	
	@Test
	public void TC_R_005() {
		logger.info("***Staring TestCase TC_R_005***");
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		RegisterPage r=new RegisterPage(driver);
		r.ClickRedioMale();
		logger.info("Clicked Male redio button");
		r.EnterFirstName("Prandfddfdav");
		logger.info("Entered FirstName");
		r.EnterLastName("Chavanfdf");
		logger.info("Entered LastName");
		r.EnterEmail("Pranfdfav@.com");
		r.ClickNewsletter();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='Email-error']")).isDisplayed());
	}
}
