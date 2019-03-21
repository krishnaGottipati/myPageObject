package com.pom.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.pom.base.Base;
import com.pom.base.GeneralFunctions;
import com.pom.base.ObjectRepositories;

public class PaytmWalletTestCase extends Base {
	
	
	
	@Test
	public void paytmWallet() {
	//topNavigationBar.clickOnPaytmWallet();
	Actions actions = new Actions(driver);
	WebElement mainMenu = driver.findElement(By.xpath("//div[@class='fklM']"));
	actions.moveToElement(mainMenu).perform();
	driver.findElement(By.xpath("//div[@class='_3_n5']//ul//li//a")).click();
	//GeneralFunctions.listOfElements(ObjectRepositories.PaytmWallet.paytmWalletdropDown_xpath);
	}

}
