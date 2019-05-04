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

		// driver.findElement(By.xpath("//div[@class='_26bf']//a[3]")).click();

		List<WebElement> list = GeneralFunctions
				.listOfElements(ObjectRepositories.shopByCategory.mainCategoryList_xpath);
		 int i=0;
		  for (WebElement li : list) { 
			  System.out.println();
		  System.out.println(li.getText());
		  i++;
		  if (li.getText().contains("ELECTRONICS")) {
			  System.out.println(li.getText());
			  System.out.println(i);
			  System.out.println("Entered"); // Clicks on the matched webelement 
			  li.click(); 
			  }
		  }
		 

		
	}
	

	
}
