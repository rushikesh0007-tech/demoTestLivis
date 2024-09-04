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
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement txtUserName;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txtpasswordName;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btnLogin;
	
	
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


