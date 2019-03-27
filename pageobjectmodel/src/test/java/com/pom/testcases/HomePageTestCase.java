package com.pom.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.base.ApplicationFunctions;
import com.pom.base.Base;
import com.pom.base.GeneralFunctions;
import com.pom.base.TopNavigationBar;


public class HomePageTestCase extends Base{
	

	
	@Test(priority=0, groups= {"regression"})
	public void clickOnNavigationBarButtons() {

		//bookOnPaytmNavigationBar.clickOnFlights();
		topNavigationBar.clickOnSearchBar();
		topNavigationBar.clickOnMobile();
		topNavigationBar.clickOnSearchBar();
		topNavigationBar.clickOnElectricity();
		topNavigationBar.clickOnSearchBar();
		topNavigationBar.searchSuggestions();
		//topNavigationBar.clickOnDTH();
		//topNavigationBar.clickOnLogin();
		
		
	}
	
	
	@Test(priority=1, dependsOnMethods= {"clickOnNavigationBarButtons"},alwaysRun=true)
	public void loginWithInvalidData() {
		topNavigationBar.clickOnLogin();
		
		
	}
	
	@Test(priority=2)
	public void loginAndBack() {
		
	}
	
	

}
