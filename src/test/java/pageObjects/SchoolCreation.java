package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SchoolCreation extends LoginPageL1{

	public SchoolCreation(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Schools']")
	WebElement schools;
	
	public void schools()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(schools));
		schools.click();
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Add New School']")
	WebElement addschool;
	
	public void addschool()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(addschool));
		addschool.click();
	}
	
	@FindBy(id="organization_name")
	WebElement organizationname;
	public void organizationname(String name)
	{
		organizationname.sendKeys(name);
	}
	
	@FindBy(id="domain_name")
	WebElement domainname;
	
	public void domainname(String name)
	{
		domainname.sendKeys(name);
	}
	
	@FindBy(id="organization_code")
	WebElement schoolcode;
	public void schoolcode(String no)
	{
		schoolcode.sendKeys(no);
	}
	
	@FindBy(id="organization_email")
	WebElement email;
	public void email(String name)
	{
		email.sendKeys(name);
	}
	
	@FindBy(id="phone_number")
	WebElement phone;
	public void phone(String no)
	{
		phone.sendKeys(no);
	}
	
	@FindBy(id="assign_organization_manager")
	WebElement adminmail;
	public void adminmail(String name)
	{
		adminmail.sendKeys(name);
	}
	
	@FindBy(id="year_of_establishment_")
	WebElement doe;
	public void doe()
	{
		
		String month="April";
		String year="2024";
		String date="1";
		
		doe.click();
		while(true)
		{
			String activeyear=driver.findElement(By.xpath("//*[@id=\"activeyear\"]")).getText();//2017
			String activemonth=driver.findElement(By.xpath("//*[@id=\"activemonth\"]")).getText();//ህዳር
			
			if(activeyear.equals(year) && activemonth.equals(month) )
			{
				break;
			}
			
			driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
		}
		
     List<WebElement> dates=driver.findElements(By.xpath("//*[@class='col f-05 d-flex flex-row justify-content-center']/button"));
     for(WebElement d:dates)//list of dates
     {
    	 if(d.getText().equals(date))
    	 {
    		 d.click();
    		 break;
    	 }
     }
	}
	
	@FindBy(id="school_academic_level_")
	WebElement schoollevel;
	public void selectlevel()
	{
		Select s= new Select(schoollevel);
		s.selectByValue("pre-primary_");
	}
	@FindBy(id="school_type_")
	WebElement schooltype;
	public void schcooltype()
	{
		Select s= new Select(schooltype);
		s.selectByValue("satellite");
	}
	
	@FindBy(id="ownership_")
	WebElement ownership;
	public void ownership()
	{
		Select s= new Select(ownership);
		s.selectByValue("government_");
	}
	
	@FindBy(id="school_category_")
	WebElement category;
	public void category()
	{
		Select s= new Select(category);
		s.selectByValue("permanent");
	}
	
	@FindBy(id="student_id_prefix_")
	WebElement stuprefix;
	public void stuprefix()
	{
		stuprefix.sendKeys("hello");
	}
	
	@FindBy(id="employee_id_prefix_")
	WebElement empprefix;
	public void empprefix()
	{
		empprefix.sendKeys("helo");
	}
	
	@FindBy(id="city_")
	WebElement city;
	public void city()
	{
		Select s= new Select(city);
		s.selectByValue("12");
	}
	
	@FindBy(id="sub_city_")
	WebElement subcity;
	public void subcity()
	{
		Select s= new Select(subcity);
		s.selectByValue("84");
	}
	
	
	@FindBy(xpath="//*[text()='Save & Next']")
	WebElement save1;
	public void save1()
	{
		save1.click();
	}
	
	//page2
	
	@FindBy(id="academic_start_month_")
	WebElement asm;
	public void asm()
	{
		
		String month="April";
		String year="2024";
		String date="1";
		
		asm.click();//span[@id='activeyear']
		while(true)
		{
			String activeyear=driver.findElement(By.xpath("//*[@id=\"activeyear\"]")).getText();//2017
			String activemonth=driver.findElement(By.xpath("//*[@id=\"activemonth\"]")).getText();//ህዳር
			
			if(activeyear.equals(year) && activemonth.equals(month) )
			{
				break;
			}
			
			driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
		}
		
     List<WebElement> dates=driver.findElements(By.xpath("//*[@class='col f-05 d-flex flex-row justify-content-center']/button"));
     for(WebElement d:dates)//list of dates
     {
    	 if(d.getText().equals(date))
    	 {
    		 d.click();
    		 break;
    	 }
     }
	}
	
	
	@FindBy(id="academic_start_month_")
	WebElement first;
	public void scroll()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",first);
	}
	
	@FindBy(id="academic_end_month_")
	WebElement aem;
	public void aem()
	{
		
		String month="April";
		String year="2024";
		String date="30";
		
		aem.click();
		while(true)
		{
			String activeyear=driver.findElement(By.xpath("//*[@id=\"activeyear\"]")).getText();//2017
			String activemonth=driver.findElement(By.xpath("//*[@id=\"activemonth\"]")).getText();//ህዳር
			
			if(activeyear.equals(year) && activemonth.equals(month) )
			{
				break;
			}
			
			driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
		}
		
     List<WebElement> dates=driver.findElements(By.xpath("//*[@class='col f-05 d-flex flex-row justify-content-center']/button"));
     for(WebElement d:dates)//list of dates
     {
    	 if(d.getText().equals(date))
    	 {
    		 d.click();
    		 break;
    	 }
     }
	}
	
	
	
	
	@FindBy(id="academic_language_NaN")
	WebElement academiclanguage;
	public void academiclanguage()
	{
		Select s= new Select(academiclanguage);
		s.selectByValue("amharic");
	}
	
	
	@FindBy(xpath="//*[text()='Save & Next']")
	WebElement save2;
	public void save2()
	{
		save2.click();
	}
//page3
	@FindBy(id="school_library")
	WebElement schoollibrary;
	public void schoollibrary()
	{
		Select s= new Select(schoollibrary);
		s.selectByValue("available");
	}

	@FindBy(id="digital_library")
	WebElement digitallibrary;
	public void digitallibrary()
	{
		Select s= new Select(digitallibrary);
		s.selectByValue("available_");
	}
	
	@FindBy(id="virtual_library")
	WebElement virtuallibrary;
	public void virtuallibrary()
	{
		Select s= new Select(virtuallibrary);
		s.selectByValue("available");
	}
	
	@FindBy(id="training_center")
	WebElement trainingcenter;
	public void trainingcenter()
	{
		Select s= new Select(trainingcenter);
		s.selectByValue("available_");
	}
	
	@FindBy(id="if_there_are_ict_center")
	WebElement ictcenter;
	public void ictcenter()
	{
		Select s= new Select(ictcenter);
		s.selectByValue("available_");
	}
	
	
	@FindBy(xpath="//*[text()='Save']")
	WebElement save3;
	public void save3()
	{
		save3.click();
	}
}