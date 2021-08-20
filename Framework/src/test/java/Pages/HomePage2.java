package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {

	WebDriver driver=null;
	
	@FindBy(id = "MP_link")
	WebElement marketPlace;
	
	
	public HomePage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public boolean verifyMarketPlace() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(marketPlace.isDisplayed()){
			return true;
		}
		else {
			return false;
		}
		
	}
}
