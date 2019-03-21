package com.pom.testcases;

import org.testng.annotations.Test;

import com.pom.base.Base;


public class BookFlightsTestCase extends Base {
	
	@Test
	public void bookFlights() throws InterruptedException {
		bookOnPaytmNavigationBar.clickOnFlights();
				
		bookFlightsPage.clickOnFromTextBox();
		bookFlightsPage.fromDropDown();
		bookFlightsPage.clickOnTOTextBox();

	}
	
	

}
