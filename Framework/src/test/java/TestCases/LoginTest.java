package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.BaseClass;
import Pages.HomePage;
import Pages.HomePage2;
import Pages.LoginPage;
import Pages.LoginPage2;


public class LoginTest extends BaseClass {

	Logger log = (Logger) LogManager.getLogger(LoginTest.class);
	
	@Test
	public void login() throws IOException {

		LoginPage2 lp = new LoginPage2(driver);
		lp.enterUN(cl.readPropertyValue("UserName"));
		lp.enterPwd(cl.readPropertyValue("Password"));
		lp.clickOnLogin();
		
		HomePage2 hp = new HomePage2(driver);
		boolean blnStatus = hp.verifyMarketPlace();
		if(blnStatus == false) {
			System.out.println("User is logged in successfully");
			log.info("User is logged in successfully");
			test.log(LogStatus.PASS, "User is logged in successfully");
			test.log(LogStatus.PASS, "User is logged in successfully");
		}
		else {
			System.out.println("User is not logged in");
			log.info("User is NOT logged in");
			test.log(LogStatus.FAIL, "User is NOT logged in");
			test.log(LogStatus.FAIL, "User is NOT logged in");
			Assert.assertEquals(true, false);
			//Call Webdriver to click the screenshot.
	        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        String imagePath = "./Results/Screenshots/1.png";
	        // Save the screenshot.
	        FileUtils.copyFile(scrFile, new File(imagePath));
	        test.log(LogStatus.FAIL, test.addScreenCapture(imagePath));
		} 
		
	}
	
	@Test
	public void loginDuplicate() {

		LoginPage2 lp = new LoginPage2(driver);
		lp.enterUN(cl.readPropertyValue("UserName"));
		lp.enterPwd(cl.readPropertyValue("Password"));
		lp.clickOnLogin();
		
		HomePage2 hp = new HomePage2(driver);
		boolean blnStatus = hp.verifyMarketPlace();
		if(blnStatus == true) {
			System.out.println("User is logged in successfully");
			log.info("User is logged in successfully");
			test.log(LogStatus.PASS, "User is logged in successfully");
			test.log(LogStatus.PASS, "User is logged in successfully");
		}
		else {
			System.out.println("User is not logged in");
			log.info("User is NOT logged in");
			test.log(LogStatus.FAIL, "User is NOT logged in");
			test.log(LogStatus.FAIL, "User is NOT logged in");

		} 
		
	}
}
