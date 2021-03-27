package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	
	WebDriver driver;
	public AccountRegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-firstname")
	WebElement txtFirstName;
	
	@FindBy(id="input-lastname")
	WebElement txtLastName;
	
	//@FindBy(cssSelector="#input-email")
	@FindBy(id="input-email")
	WebElement txtEmail;
	
	@FindBy(name="telephone")
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConformPassword;
	
	@FindBy(name="agree")
	WebElement chckPolicy;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement clickcontinue;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement msgConformation;
	
	public void setFirstname(String fname)
	{
		txtLastName.sendKeys(fname);
	}

	public void setLasttname(String lname)
	{
		txtFirstName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String tel)
	{
		txtTelephone.sendKeys(tel);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setConformPassword(String cnfpwd)
	{
		txtConformPassword.sendKeys(cnfpwd);
	}
	
	public void setPrivacyPolicy()
	{
		chckPolicy.click();
	}
	public void clickContinue()
	{
		clickcontinue.click();
	}
	
	public String getConfirmation()
	{
		try {
		return(msgConformation.getText());
		}catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	
	
}
