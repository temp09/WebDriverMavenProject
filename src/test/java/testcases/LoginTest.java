package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginTest {
	
	public static WebDriver driver ;
	
	public void setUp(){
		
		driver = new FirefoxDriver();
		
		
	}
public void doLogin(){
	
	
	driver.get("http://gmail.com");
	driver.findElement(By.id("Email")).sendKeys("trainer@way2automation.com");
	driver.findElement(By.id("Pawd")).sendKeys("sdfdsf");
}

public void tearDown(){
	
	driver.quit();
}

}
