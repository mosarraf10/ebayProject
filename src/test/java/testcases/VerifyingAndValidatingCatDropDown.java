package testcases;

import org.testng.annotations.Test;

public class VerifyingAndValidatingCatDropDown extends BaseTest {

	@Test(enabled = true, priority = 400)
	public void verifyingAndValidatingCatDropDown() {

		CategoryDropDown cdd = new CategoryDropDown();
		ItemsInCategoryDropdownField icdd = new ItemsInCategoryDropdownField();

		if (cdd.categoryDropDown().equals(icdd.getItemsInCatDD())) {
			System.out.println("Dropdown Categories match. Verification Passed");
		} else if (cdd.categoryDropDown() == icdd.getItemsInCatDD()) {
			System.out.println("Dropdown Categories match. Verification Passed");
		} else if (cdd.categoryDropDown() != icdd.getItemsInCatDD()) {
			System.out.println("Dropdown items DO NOT MATCH. Verification FAILED!");
		}
	}

}
