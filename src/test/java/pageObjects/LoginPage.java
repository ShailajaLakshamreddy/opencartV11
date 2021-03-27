package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	WebElement txtEmailAddress;
	
	@FindBy(id="input-password")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement btnLogin;
	
	@FindBy(xpath="//div//div[@id='content']/h2[contains(text(),'My Account')]")
	WebElement msgHeading;
	
	public void setEmail(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	public boolean isMyAccountPageExits()
	{
		
		try
		{
			return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
}
