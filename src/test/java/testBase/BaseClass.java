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

		String currentDir = System.getProperty("user.dir");
  System.out.println("Current dir using System:" + currentDir);
System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
//options = new ChromeOptions();
ChromeOptions options = new ChromeOptions();
//options.addArguments("--remote-debugging-port=9222");
options.addArguments("--headless"); // Run in headless mode
       options.addArguments("--no-sandbox"); // Bypass the sandbox
       options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
driver = new ChromeDriver(options);
//driver.get("https://amazon.in");
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--headless"); options.addArguments("--no-sandbox");
		 * options.addArguments("--disable-dev-shm-usage");
		 * options.addArguments("--disable-gpu"); driver = new ChromeDriver(options);
		 */

		//driver= new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@AfterMethod
	public void tearDown() {
		 if (driver != null) {
	            driver.quit();
	        }
	}

}
