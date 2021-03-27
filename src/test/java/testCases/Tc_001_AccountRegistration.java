package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class Tc_001_AccountRegistration extends BaseClass {
	
	
	
	@Test(groups={"regression","master"})
	public void test_account_Registration()
	{
		logger.info("Strating Tc_001_AccountRegistration");
		try
		{
		
		driver.get(rb.getString("appURL"));
		logger.info("Home page displayed");
		HomePage hp=new HomePage(driver);
		hp.clikMyaccount();
		logger.info("Clicked on Myaccount");
		hp.clikRegister();
		logger.info("Clicked on Register");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		regpage.setFirstname("Ram");
		logger.info("provided first name");
		
		regpage.setLasttname("sam");
		logger.info("provided first name");
		
		regpage.setEmail(randomestring()+"@gmail.com");
		logger.info("provided email");
		
		regpage.setTelephone("12345678");
		logger.info("provided Telephone");
		
		regpage.setPassword("abcdef");
		logger.info("provided password");
		
		regpage.setConformPassword("abcdef");
		logger.info("provided confrmed password");
		
		regpage.setPrivacyPolicy();
		logger.info("set privacy policy");
		
		regpage.clickContinue();
		logger.info("clicked on Continue");
		
		String confmsg=regpage.getConfirmation();
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			logger.info("Account registration success");
			Assert.assertTrue(true);
		}else
		{
			captureScreen(driver,"test_account_Registration");
			logger.error("Account registration failed");
			Assert.assertTrue(false);
		}
		}
		catch(Exception e)
		{
			logger.fatal("Account registration failed");
			Assert.fail();
		}
		
		logger.info("Finished Tc_001_AccountRegistration");
	}
	
   
	

}
