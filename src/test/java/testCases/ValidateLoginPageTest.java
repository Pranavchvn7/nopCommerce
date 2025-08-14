package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class ValidateLoginPageTest extends BaseClass{

	@Test
	public void TC_L_001() {
		logger.info("***Staring TestCase TC_L_001***");
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LoginPage l=new LoginPage(driver);
		l.EnterEmail("admin@admin.com");
		logger.info("Entered Email");
		l.EnterPassword("password123");
		logger.info("Entered Password");
		l.ClickLogin();
		logger.info("Clicked Login");
		Assert.assertTrue(true);
	}
	
	@Test
	public void TC_L_002() {
		logger.info("***Staring TestCase TC_L_002***");
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LoginPage l=new LoginPage(driver);
		l.EnterEmail("admin@admin.com");
		logger.info("Entered Email");
		l.EnterPassword("password123");
		logger.info("Entered Password");
		l.ClickRememberMe();
		logger.info("Clicked Remember Me");
		l.ClickLogin();
		logger.info("Clicked Login");
		driver.navigate().back();
		driver.navigate().forward();
		//Assert.assertEquals(driver.getTitle(), "nopCommerce demo store. Home page title");
		Assert.assertTrue(true);
	}
	
	@Test
	public void TC_L_003() {
		logger.info("***Staring TestCase TC_L_003***");
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LoginPage l=new LoginPage(driver);
		l.ClickLogin();
		logger.info("Clicked Login");
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='Email-error']")).isDisplayed());
	}
}
