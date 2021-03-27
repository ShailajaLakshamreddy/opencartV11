package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Tc_002_Login extends BaseClass{
	@Test(groups={"sanity","master"})
	public void testLogin()
	{
		logger.info("Starting Tc_002_Login");
		try 
		{
			driver.get(rb.getString("appURL"));
			logger.info("Home page displayed");
			
			driver.manage().window().maximize();
			HomePage hp=new HomePage(driver);
			
			hp.clikMyaccount();
			logger.info("Clicked on MyAccount");
			
		    hp.clikLogin();
		    logger.info("clicked on loginlink");
			
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			logger.info("provided email");
			
			lp.setPassword(rb.getString("password"));
			logger.info("provided password");
			
			lp.clickLogin();
			logger.info("clicked on login button");
			
			boolean targetpage=lp.isMyAccountPageExits();
			if(targetpage==true)
			{
				logger.info("Login success");
				Assert.assertTrue(true);
			}else
			{
				logger.error("login failed");
				captureScreen(driver,"test_login");
				Assert.assertTrue(false);
			}
			
		}catch(Exception e)
		{
			logger.fatal("Login failed");
			Assert.fail();
		}
		logger.info("Finished Tc_002_Login");
	}

}
