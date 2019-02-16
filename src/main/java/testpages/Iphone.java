package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Iphone extends BasePage{
	
	public Iphone(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//h2[contains(text(),'Buy It Now')]")
	public WebElement buyItNow;
	
	public WebElement getBuyItNow() {
		return buyItNow;
	}

}
