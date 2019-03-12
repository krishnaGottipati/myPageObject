package com.pom.base;

import org.openqa.selenium.WebDriver;

public class ApplicationFunctions {
	
	 static WebDriver driver;

	public ApplicationFunctions(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public static void clickOnMobile() {
		System.out.println("Entered into application fns");
		System.out.println(ObjectRepositories.MobilePage.MobileRechargeButton_xpath);
		GeneralFunctions.waitAndFindElement(ObjectRepositories.MobilePage.MobileRechargeButton_xpath, 30).click();
	
		System.out.println("exited from appliccation fns");
	}
	
	public void clickOnElectricity() {
		
	}
	
	public void clickOnDTH() {
		
	}
	
	public void clickOnMetro() {
		
	}
	
	public void clickOnLandline() {
		
	}
	
	public void clickOnBroadBand() {
		
	}

}
