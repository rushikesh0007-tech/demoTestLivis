package testCases;

import org.testng.annotations.Test;

import pageObjects.Loginpage;
import testBase.BaseClass;



public class LoginTest extends BaseClass{
	@Test
	public void testValidLoginTest() {
		Loginpage lp= new Loginpage(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickLoginButton();
			
       
	}
}
