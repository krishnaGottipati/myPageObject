package com.pom.pages;

import com.pom.base.GeneralFunctions;
import com.pom.base.ObjectRepositories;

public class BookFlightsPage {

	public void clickOnFromTextBox() throws InterruptedException {
		//GeneralFunctions.clickButton(ObjectRepositories.Flights.clickOnFromTextBox_xpath);
		GeneralFunctions.waitAndFindElement(ObjectRepositories.Flights.clickOnFromTextBox_xpath, 30);
		Thread.sleep(100);
		//GeneralFunctions.listOfElements(ObjectRepositories.Flights.fromDropdownItems_xpath);
	}
	
	public void fromDropDown() {
		GeneralFunctions.listOfElements(ObjectRepositories.Flights.fromDropdownItems_xpath);
		//GeneralFunctions.waitAndFindElement(ObjectRepositories.Flights.fromDropdownItems_xpath, 30);
	}
	
	public void clickOnTOTextBox() {
		//GeneralFunctions.clickButton(ObjectRepositories.Flights.clickOnToTextBox_xpath);
		GeneralFunctions.waitAndFindElement(ObjectRepositories.Flights.clickOnToTextBox_xpath, 30);
	}
	
	public void clickOnTravellers() {
		GeneralFunctions.clickButton(ObjectRepositories.Flights.clickOnTravellersClass_xpath);
	}
}
