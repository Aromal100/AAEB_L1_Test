package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPageL1;
import testBase.DomainPage;

public class Test_L1_Login extends DomainPage{
	


	@Given("user enters AAEB domain page")
	public void user_enters_aaeb_domain_page() throws IOException {
	    
		super.setup();
	}

	@And("user click on the Login button")
	public void user_click_on_the_login_button() {
		LoginPageL1 l=new LoginPageL1(driver);
		l.Login();
	    
	}

	@Then("user enter the username {string}")
	public void user_enter_the_username(String username) {
		LoginPageL1 l=new LoginPageL1(driver);
		l.email(username);
		
	    
	}

	@And("click on the submit button")
	public void click_on_the_submit_button() {
		LoginPageL1 l=new LoginPageL1(driver);
		l.next();
	}

	@Then("user need to enter the password {string}")
	public void user_need_to_enter_the_password(String password) throws InterruptedException {
	    
		LoginPageL1 l=new LoginPageL1(driver);
		Thread.sleep(2000);
		l.password(password);

	}

	@And("click on the continue button")
	public void click_on_the_continue_button() {
		LoginPageL1 l=new LoginPageL1(driver);
		l.cont();
	}

	@Then("user enters the dsahboard of the AAEB domain")
	public void user_enters_the_dsahboard_of_the_aaeb_domain() {
		LoginPageL1 l=new LoginPageL1(driver);
		boolean page=l.title();
		Assert.assertTrue(page);
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
