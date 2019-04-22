package com.pom.testcases;

import org.testng.annotations.Test;

import com.pom.base.Base;
import com.pom.base.GeneralFunctions;
import com.pom.base.ObjectRepositories;

public class ShopByCategoryMenuTestCase extends Base {
	
	@Test
	public void validateShopBycategorysection() {
		topNavigationBar.clickonShopByCategoryHamburgerButton();
		softAssert.assertTrue(GeneralFunctions.waitAndFindElement(ObjectRepositories.shopByCategory.shopBycategorysection_xpath, 30).isDisplayed());
		softAssert.assertEquals(GeneralFunctions.waitAndFindElement(ObjectRepositories.shopByCategory.shopByCategoryMenuHeading_xpath, 30).getText(), " Shop by Category");
		GeneralFunctions.listOfElements(ObjectRepositories.shopByCategory.mainCategoryList_xpath);
	}

}
