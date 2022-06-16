package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckBoxes {
	
	public static WebDriver driver;
	
public static boolean isElementPresesnt( By by) {
		
		try {
		driver.findElement(by);
		return true;
		}catch( Throwable t) {
			return false;
		}
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Perfect solution for test checkboxes for each blocis bellow code
		
		//WebElement block1 = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		WebElement block2 = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[6]"));
		List<WebElement> checkboxes = block2.findElements(By.name("sports"));
		System.out.println("Total number of checkboxes : "+checkboxes.size());
		
		for ( WebElement checkbox: checkboxes) {
			checkbox.click();
		}
		
		
		
		// click the each checkboxes
		
		/*
		 * driver.findElement(By.xpath("//div[4]/input[1]")).click();
		 * driver.findElement(By.xpath("//div[4]/input[2]")).click();
		 * driver.findElement(By.xpath("//div[4]/input[3]")).click();
		 * driver.findElement(By.xpath("//div[4]/input[4]")).click();
		 */
		
		/* for ( int i=1 ; i<=4 ; i++) {
			
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			
		}*/
		
		// if number of checkboxes are unknown then use while loop which is not also optimize way
		
		/* int i = 1;
		int counter = 0;
		
		while(isElementPresesnt(By.xpath("//div[4]/input["+i+"]"))) {
			
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			i++ ;
			counter++;
						
		}
		System.out.println("Total number of chekboxes conut : "+counter);*/
		
		

	}

}
