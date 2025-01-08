package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPageL1;
import testBase.DomainPage;

public class Test_L1_Login extends DomainPage{
	
	@Test
	public void test() throws InterruptedException
	{
		LoginPageL1 l=new LoginPageL1(driver);
		l.Login();
		l.email(p.getProperty("email"));
		l.next();
		Thread.sleep(2000);
		l.password(p.getProperty("pass"));
		l.cont();
		boolean page=l.title();
		Assert.assertTrue(page);
				
	}

}
