package com.pom.base;

import org.openqa.selenium.By;

public class ObjectRepositories {

	public static class MobilePage {

		// public static By MobileRechargeButton_xpath =
		// By.xpath("//div[@class='_2kcr']//a[@title='Mobile ']");
		public static By MobileRechargeButton_xpath = By.xpath("//a//span[contains(text(),'Mobile')]");
		public static By operator_xpath = By.xpath("//div[@class='_1EzG']//ul//li//a");
		public static By drop_xpath = By.xpath("//div[@class='_1EzG']//ul//li//a");
		public static By circle_xpath = By
				.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/ul/li[3]/div/div/input");
	}

	public static class ElectricityPage {
		/* Object Repository for Electricity page */
		public static By select_state_dropdown = By.xpath("//div[@class='_3xI1']//ul");
		public static By select_state = By.xpath("//div[@class='_1exI']//label[contains(text(),'Select State')]");
		public static By clickOn_electricity_button_xpath = By.xpath("//a//span[contains(text(),'Electricity')]");

		public static By operatorNew = By.xpath("//div[@class='_1EzG']//ul//li//a");
		
	}

	public static class DTHPage {
		public static By clickOn_DTH_button_xpath = By.xpath("//a//span[contains(text(),'DTH')]");
	}

	public static class Movies {
		public static By clickOnMoviesButton_xpath = By.xpath("//div[@class='_17WC']//a[@title='Movies']");
	}

	public static class Flights {
		public static By clickOnFlightsButton_xpath = By.xpath("//div[@class='_17WC']//a[@title='Flights']");
		public static By clickOnFromTextBox_xpath = By.xpath("//label[contains(text(),'From')]");
		public static By fromDropdownItems_xpath = By.xpath("//div[@class='_2Alu']//div");
		public static By clickOnToTextBox_xpath = By.xpath("//label[contains(text(),'To')]");
		public static By clickOnTravellersClass_xpath = By.xpath("//div[@class='fl-input-container']//label[contains(text(),'Travellers, Class')]");
	}
	
	public static class Search {
		public static By clickOnSearchBar_xpath = By.xpath("//input[@placeholder='Search for a Product , Brand or Category']");
		public static By searchSuggestions_xpath = By.xpath("//div[@class='suggestedSearch' or @class='_2XMk']"); 
	}
	
	public static class Login{
		public static By clickOnLoginButton_xpath = By.xpath("//div[contains(text(),'Log In/Sign Up')]");
		public static By loginTabiFrame_cssSelector = By.cssSelector("iframe[src='/v1/api/login?isIframe=true&theme=mp-web']");
		public static By loginWithMobileNumber_xpath = By.xpath("//span[contains(text(),'Login/Signup with mobile number and password')]");
	}
	
	public static class PaytmWallet{
		public static By clickOnPaytmWalletButton_xpath = By.xpath("//div[@class='fklM']");
		public static By paytmWalletdropDown_xpath = By.xpath("//div[@class='_3_n5']//ul//li");
	}
	
	public static class shopByCategory{
		public static By shopByCategoryButton_xpath = By.xpath("//div[@class='_22in']//i[@class='iconMenu cursor']");
		public static By shopBycategorysection_xpath = By.xpath("//div[@class='_3s3i']");
		public static By shopByCategoryMenuHeading_xpath = By.xpath("//span[@class='_2pDj' and text()=' Shop by Category']");
		public static By mainCategoryList_xpath = By.xpath("//div[@class='_26bf']");
		
		public static By subMenuCategoryList_xpath = By.xpath("//div[@class='bbKy']//div[@class='_2ylo']//div[contains(@class,'_31Cs _2nGI')]");
		
		
	}


}
