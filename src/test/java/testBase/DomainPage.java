package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DomainPage {
	
	public static WebDriver driver;
	public Properties p;
	
	@BeforeClass
	public void setup() throws IOException
	{
		FileReader fr=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(fr);
		
		driver= new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void end() throws InterruptedException
	{
//		Thread.sleep(2000);
//		driver.quit();
	}
	

}
