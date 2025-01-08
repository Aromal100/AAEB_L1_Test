package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.LoginPageL1;
import pageObjects.SchoolCreation;
import testBase.DomainPage;

public class Test_L1_SchoolCreation extends DomainPage {
	
	@Test
	public void schoolcreation() throws InterruptedException
	{
		
		Faker f= new Faker();
		String name=f.name().fullName();
		String scode="S"+f.number().digits(3);
		String mail=f.internet().emailAddress();
		String admail=f.internet().emailAddress();
		String no="9"+f.phoneNumber().subscriberNumber(8);
		
		LoginPageL1 l= new LoginPageL1(driver);
		l.Login();
		l.email(p.getProperty("email"));
		l.next();
		Thread.sleep(2000);
		l.password(p.getProperty("pass"));
		l.cont();
		boolean page=l.title();
		Assert.assertTrue(page);
		Thread.sleep(2000);
		SchoolCreation sc= new SchoolCreation(driver);
		sc.schools();
		sc.addschool();
		sc.organizationname(name);
		sc.domainname(name);
		sc.schoolcode(scode);
		sc.email(mail);
		sc.phone(no);
		sc.adminmail(admail);
		sc.doe();
		sc.selectlevel();
		sc.schgooltype();
		sc.ownership();
		sc.category();
		sc.save1();
	//page2
		Thread.sleep(2000);
		sc.subcity();
		sc.woreda();
		sc.academiclanguage();
		sc.education();
		sc.save2();
	//page3
		Thread.sleep(2000);
		sc.schoollibrary();
		sc.digitallibrary();
		sc.virtuallibrary();
		sc.trainingcenter();
		sc.ictcenter();
		sc.digitalinformation();
		sc.save3();
		
	}

}
