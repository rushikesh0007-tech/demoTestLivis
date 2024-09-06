package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {

	
	//constructor
	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	
	// webElement
	
	@FindBy(xpath="//input[@id='email']") WebElement txtUserName;
	@FindBy(xpath="//input[@id='password']") WebElement txtpasswordName;
	@FindBy(xpath="//button[@id='livis-login-btn']") WebElement btnLogin;
	
	
	public void setUsername(String user) {
        txtUserName.sendKeys(user);
    }

    public void setPassword(String pass) {
        txtpasswordName.sendKeys(pass);
    }

    public void clickLoginButton() {
        btnLogin.click();
    }
	
	

}


