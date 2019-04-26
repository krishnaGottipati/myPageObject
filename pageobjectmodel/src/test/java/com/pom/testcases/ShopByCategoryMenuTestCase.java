package com.pom.testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pom.base.Base;
import com.pom.base.GeneralFunctions;
import com.pom.base.ObjectRepositories;

public class ShopByCategoryMenuTestCase extends Base {

	@Test
	public void validateShopBycategorysection() {
		topNavigationBar.clickonShopByCategoryHamburgerButton();
		softAssert.assertTrue(GeneralFunctions
				.waitAndFindElement(ObjectRepositories.shopByCategory.shopBycategorysection_xpath, 30).isDisplayed());
		softAssert.assertEquals(GeneralFunctions
				.waitAndFindElement(ObjectRepositories.shopByCategory.shopByCategoryMenuHeading_xpath, 30).getText(),
				" Shop by Category");
		
	//	driver.findElement(By.xpath("//div[@class='_26bf']//a[3]")).click();
		
		List<WebElement> list = GeneralFunctions.listOfElements(ObjectRepositories.shopByCategory.mainCategoryList_xpath);
		ArrayList categoryListarray = new ArrayList();
		for(WebElement categoryList : list) {
			
		categoryListarray.add(categoryList.getText());
		
		for (WebElement element:list) {
		    if ( element.equals( "GROCERY" )) {
		    	driver.findElement(By.xpath("//div[@class='_26bf']//a[3]")).click();
		    }
		}
			
		}
		System.out.println("array list = " + categoryListarray);
		
		
		/*
		List<WebElement> list = GeneralFunctions
				.listOfElements(ObjectRepositories.shopByCategory.mainCategoryList_xpath);

		int size = list.size(); // Need to use this while comparing with config file

		for (WebElement categoryList : list) {
			//System.out.println("categorylist = " +categoryList.getText());
			if (categoryList.getText().equals("Grocery")) {
				
				System.out.println(categoryList.getTagName());
			}
		}
	*/
	}
}
