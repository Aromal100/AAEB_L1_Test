package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageL1 extends BaseL1Page {

	public LoginPageL1(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement Login;
	
	public void Login()
	{
      Login.click();
	}
	
	@FindBy(id="email")
	WebElement email;
	
	public void email(String mail)
	{
		email.sendKeys(mail);
	}
	
	@FindBy(id="SubmitBtn")
	WebElement next;
	
	public void next()
	{
		next.click();
	}
	
	@FindBy(id="password")
	WebElement password;
	
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	
	@FindBy(id="continueBtn")
	WebElement cont;
	
	public void cont()
	{
		cont.click();
	}
	
	@FindBy(id="ekBrandName")
	WebElement title;
	
	public boolean title()
	{
		try
    	{
    		return(title.isDisplayed());
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
		
	}

}
