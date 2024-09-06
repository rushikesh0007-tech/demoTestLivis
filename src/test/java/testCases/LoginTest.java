package testCases;

import org.testng.annotations.Test;

import pageObjects.Loginpage;
import testBase.BaseClass;



public class LoginTest extends BaseClass{
	@Test
	public void testValidLoginTest() {
		Loginpage lp= new Loginpage(driver);
		lp.setUsername("devteam@dev-livis.ai");
		lp.setPassword("123@Devs");
		lp.clickLoginButton();
			
       
	}
}
