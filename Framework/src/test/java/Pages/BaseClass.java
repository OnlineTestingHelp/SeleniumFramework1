package Pages;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import CommonFunc.CommonLib;

public class BaseClass {
	public WebDriver driver=null;
	public CommonLib cl; 
	
	public ExtentReports report;
	public ExtentTest test;
	
	
	@BeforeSuite
	public void bSuite() {
		report = new ExtentReports("./Results/Reports.html");
	}
	
	
	

	@BeforeMethod
	public void launch(Method method) throws IOException {
		
		test = report.startTest(method.getName());
		
		cl = new CommonLib();
		cl.LoadPropertyFile();
		System.setProperty("webdriver.chrome.driver", cl.readPropertyValue("DriverPath"));
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(cl.readPropertyValue("URL"));
	
	}
	
	@AfterMethod
	public void aMethod() {
		driver.quit();
		report.endTest(test);
	}
	
	@AfterSuite
	public void aSuite() {
		report.flush();
	}
}
