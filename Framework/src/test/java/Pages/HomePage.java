package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver=null;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By marketPlace = By.id("MP_link");
	
	public boolean verifyMarketPlace() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(driver.findElement(marketPlace).isDisplayed()){
			return true;
		}
		else {
			return false;
		}
		
	}
}
