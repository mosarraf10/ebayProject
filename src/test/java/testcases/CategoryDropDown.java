package testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import testpages.LandingPage;

public class CategoryDropDown extends BaseTest{
	
	public List<String> categoryDropDown(){
		
		LandingPage lp = new LandingPage(driver);
		
		List<WebElement>categoryDropDown = lp.getCategoryDropDown();
		List<String> stringValueOfCatDD = new ArrayList<String>();
		
		for(WebElement w : categoryDropDown) {
			stringValueOfCatDD.add(w.getText());
		}
		return stringValueOfCatDD;
		
	} 

}
