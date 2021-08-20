package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver=null;
	
	//Locators
	@FindBy(name="txtUsername")
	WebElement userName;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='LOGIN']")
	WebElement btnLogin;
	

	public LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods
	public void enterUN(String UN) {
		//driver.findElement(txtusername).sendKeys(UN);
		userName.sendKeys(UN);
	}
	
	public void enterPwd(String Pwd) {
		//driver.findElement(txtpassword).sendKeys(Pwd);
		password.sendKeys(Pwd);
	}
	
	public void clickOnLogin() {
		//driver.findElement(btnLogin).click();
		btnLogin.click();
	}
	
	
	
}
