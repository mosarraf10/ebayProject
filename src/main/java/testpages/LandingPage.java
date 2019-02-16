package testpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{

	public LandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "#gh-ac")
	public WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}

	@FindBy(css = "#gh-cart-i")
	public WebElement cartButton;

	public WebElement getCartButton() {
		return cartButton;
	}

	@FindBy(css = "#gh-cat")
	public List<WebElement> categoryDropDown;

	public List<WebElement> getCategoryDropDown() {
		return categoryDropDown;
	}
	
	@FindBy(css = "#gh-btn")
	public WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}
}
