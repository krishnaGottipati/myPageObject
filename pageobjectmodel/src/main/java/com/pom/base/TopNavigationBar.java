package com.pom.base;

public class TopNavigationBar {

	public void clickOnMobile() {
		GeneralFunctions.clickButton(ObjectRepositories.MobilePage.MobileRechargeButton_xpath);
	}

	public void clickOnElectricity() {
		GeneralFunctions.clickButton(ObjectRepositories.ElectricityPage.clickOn_electricity_button_xpath);
	}

	public void clickOnDTH() {
		GeneralFunctions.clickButton(ObjectRepositories.DTHPage.clickOn_DTH_button_xpath);
	}

	public void clickOnMetro() {

	}

	public void clickOnLandline() {

	}

	public void clickOnBroadBand() {

	}
	
	public void clickOnSearchBar() {
		GeneralFunctions.clickButton(ObjectRepositories.Search.clickOnSearchBar_xpath);
	}
	public void searchSuggestions() {
		GeneralFunctions.waitAndFindElement(ObjectRepositories.Search.searchSuggestions_xpath, 30);
		GeneralFunctions.listOfElements(ObjectRepositories.Search.searchSuggestions_xpath);
	}
	
	public void clickOnLogin() {
		GeneralFunctions.clickButton(ObjectRepositories.Login.clickOnLoginButton_xpath);
		GeneralFunctions.switchToFrame(ObjectRepositories.Login.loginTabiFrame_cssSelector);
		GeneralFunctions.waitAndFindElement(ObjectRepositories.Login.loginWithMobileNumber_xpath, 50).click();
	}
	
	public void clickOnPaytmWallet() {
		GeneralFunctions.clickButton(ObjectRepositories.PaytmWallet.clickOnPaytmWalletButton_xpath);
	}
	
	public void clickonShopByCategoryHamburgerButton() {
		GeneralFunctions.clickButton(ObjectRepositories.shopByCategory.shopByCategoryButton_xpath);
	}

}
