package com.pom.pages;

import com.pom.base.GeneralFunctions;
import com.pom.base.ObjectRepositories;

public class ElectricityPage {
	
			
		public void clickOnElectricityButton() {
			GeneralFunctions.clickButton(ObjectRepositories.ElectricityPage.clickOn_electricity_button_xpath);
			
		}
		
		public void clickOnSelectState() {
			GeneralFunctions.clickButton(ObjectRepositories.ElectricityPage.select_state);
		
		}
		
		public void selectStateDropDown() {
			GeneralFunctions.listOfElements(ObjectRepositories.ElectricityPage.select_state_dropdown);
			
		}
	}



