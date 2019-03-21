package com.pom.testcases;

import org.testng.annotations.Test;

import com.pom.base.Base;

public class ElectricityTestCase extends Base{
	
	
	@Test
	public void electricity() {
		
		electricityPage.clickOnElectricityButton();
		softAssert.assertEquals(false, true);
		electricityPage.clickOnSelectState();
		electricityPage.selectStateDropDown();
		
		
		softAssert.assertAll();
	}

}
