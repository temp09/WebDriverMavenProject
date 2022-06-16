package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTables {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Getting the number of rows and columns
		
		List<WebElement> rowNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("total number of rows : "+rowNum.size());
		
		
		List<WebElement> colNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("total number of colmns : "+colNum.size());
		
		// Printing all rows and columns
		
		for ( int rows = 1; rows<=rowNum.size(); rows++) {
			for( int colmns = 1; colmns<= colNum.size(); colmns++) {
				
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+colmns+"]")).getText()+"  ");
			}
			System.out.println();
		}
		
		
		//table[@class='dataTable']/tbody/tr[1]/td
	}

}
