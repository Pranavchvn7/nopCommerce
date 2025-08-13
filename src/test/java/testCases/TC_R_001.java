package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_R_001 extends BaseClass{

	@Test
	public void sample() throws InterruptedException {
		logger.info("***Staring TestCase TC_R_001***");
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
}
