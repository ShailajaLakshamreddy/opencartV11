package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='caret']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText="Register")
	WebElement lnkRegister;
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	WebElement lnklogout;
	
	public void clikMyaccount()
	{
		lnkMyaccount.click();
	}
	
	public void clikRegister()
	{
		lnkRegister.click();
	}
	
	public void clikLogin()
	{
		lnkLogin.click();
	}
	
	
	
	

}
