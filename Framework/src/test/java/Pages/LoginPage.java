package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver=null;
	
	//Locators
	By txtusername = By.name("txtUsername");
	By txtpassword = By.id("txtPassword");
	By btnLogin = By.xpath("//input[@value='LOGIN']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Methods
	public void enterUN(String UN) {
		driver.findElement(txtusername).sendKeys(UN);
	}
	
	public void enterPwd(String Pwd) {
		driver.findElement(txtpassword).sendKeys(Pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(btnLogin).click();
	}
	
	
	
}
