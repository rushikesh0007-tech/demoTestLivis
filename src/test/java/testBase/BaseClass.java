package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;

	@BeforeMethod
	public void Setup() {
		
		// This is for gitHub

		
		/*
		 * String currentDir = System.getProperty("user.dir");
		 * System.out.println("Current dir using System:" + currentDir);
		 * System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * 
		 * options.addArguments("--headless"); // Run in headless mode
		 * options.addArguments("--no-sandbox"); // Bypass the sandbox
		 * options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource
		 * driver = new ChromeDriver(options);
		 * 
		 * driver.get("https://demo.livis.ai/auth/login");
		 * 
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 */

		 // this is for local
			
			
			  driver = new ChromeDriver(); driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); driver.
			  get("https://demo.livis.ai/auth/login");
			 
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
