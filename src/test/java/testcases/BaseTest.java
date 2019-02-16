package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;
	String expectedURL = "https://www.ebay.com/";
	
	@BeforeClass
	public void getSetup() {
		String os = System.getProperty("os.name").toLowerCase();
		String userDir = System.getProperty("user.dir");
		
		String winDriverPath = System.getProperty(userDir + "\\Drivers\\chromedriver.exe");
		String macDriverPath = System.getProperty(userDir + "Drivers/chromedriver");
		
		if(os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", macDriverPath);
		}else {
			System.setProperty("webdriver.chrome.driver", winDriverPath);
		}
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void getURL() {
		driver.navigate().to(expectedURL);
		String actualURL = driver.getCurrentUrl();
		System.out.println("Run URL Validation test");
		try {
			Assert.assertEquals(expectedURL, actualURL);
			System.out.println("Actual URL matches Expected URL");
		}catch (Exception e) {
			System.out.println("Actual URL DO NOT match Expected URL");
		}
	}
	
	@AfterMethod
	public void segregateTestCases() {
		System.out.println("Test cases finished running");
	}
	
	@AfterClass
	public void closeBrowsers() {
		driver.close();
		driver.quit();
	}

}
