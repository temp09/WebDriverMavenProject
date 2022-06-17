package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {
	
	public static WebDriver driver ;
	
	@BeforeSuite
	public void setUp(){
		
		driver = new FirefoxDriver();
		
		
	}
@Test
public void doLogin(){
	
	
	driver.get("http://gmail.com");
	driver.findElement(By.id("Email")).sendKeys("trainer@way2automation.com");
	driver.findElement(By.id("Pawd")).sendKeys("sdfdsf");
}

@AfterSuite
public void tearDown(){
	
	driver.quit();
}

}
