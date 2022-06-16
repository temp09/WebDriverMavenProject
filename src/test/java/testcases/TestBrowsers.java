package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) {
		
		// import package ctrl+shift+O
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\amdad\\AllImportantInfo\\AllPOIJar\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\amdad\\AllImportantInfo\\AllPOIJar\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\amdad\\AllImportantInfo\\AllPOIJar\\msedgedriver.exe");
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();  // WebDriver is the main interface for diff browser which has highet parnet SearchContext
		driver.get("https://google.com");
		
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);
		
		driver.close();  // current browser window
		driver.quit();  // current browser window and related all browsers windows
	}

}
