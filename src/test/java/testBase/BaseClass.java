package testBase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public Logger logger;
	@BeforeMethod
	public void setup() {
		//logger variable to use log4j
		logger=LogManager.getLogger(this.getClass());
		
		ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        options.setAcceptInsecureCerts(true);
        options.addArguments("--ignore-certificate-errors");
		driver=new ChromeDriver(options);
		WebDriverManager.chromedriver().setup();
		driver.get("http://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public String captureScreen(String name) {
		String timeStamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		TakesScreenshot takeScreenShot= (TakesScreenshot)driver;
		File src= takeScreenShot.getScreenshotAs(OutputType.FILE);
		String desPath=System.getProperty("user.dir")+"\\screenshots\\"+name+"_"+timeStamp+".png";
		File des=new File(desPath);
		src.renameTo(des);
		return desPath;
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
