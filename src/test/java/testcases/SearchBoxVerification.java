package testcases;

import org.testng.annotations.Test;

import testpages.LandingPage;

public class SearchBoxVerification extends BaseTest{
	
	@Test(enabled = true, priority = 100)
	public void verifyingSearchBox() {
		
		LandingPage lp = new LandingPage(driver);
		
		/** Verifying searchBox*/
		if(lp.getSearchBox().isEnabled() && lp.getSearchBox().isDisplayed()) {
			lp.getSearchBox().sendKeys("iphone");
			lp.getSearchButton().click();
			System.out.println("Search box is enabled and displayed. Verification passed");
		}else {
			System.out.println("Search box is NOT enabled and NOT displayed. Verification failed");
		}
	}

}
