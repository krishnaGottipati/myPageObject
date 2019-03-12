package com.pom.testcases.HomePage;

import org.testng.annotations.Test;

import com.pom.base.Base;


public class BookFlightsTestCase extends Base {
	
	@Test
	public void bookFlights() {
		bookOnPaytmNavigationBar.clickOnFlights();
				
		bookFlightsPage.clickOnFromTextBox();
		bookFlightsPage.fromDropDown();
		bookFlightsPage.clickOnTOTextBox();

	}
	
	

}
