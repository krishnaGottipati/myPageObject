package com.pom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pom.pages.BookFlightsPage;

public class Base {
	public static WebDriver driver;
	Properties prop;
	// public static ApplicationFunctions applicationFunctions;
	GeneralFunctions generalFunctions;
	public static BookOnPaytmNavigationBar bookOnPaytmNavigationBar;
	public static TopNavigationBar topNavigationBar;
	public static BookFlightsPage bookFlightsPage;

	/*
	 * TestBase constructor has the details of the properties file and load the data
	 */
	public Base() {

		if (driver == null) {
			try {
				prop = new Properties();
				FileInputStream fis = new FileInputStream(
						"C:/Users/kls/Documents/pageobjectmodel/src/test/resources/com/pom/properties/config.properties");
				prop.load(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			initilizeDriver();
		}

	}

	/* Initialization has the browser details */
	public void initilizeDriver() {
		String browserName = prop.getProperty("browser");
		if(browserName.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Users//kls//Downloads//chromedriver_win32//chromedriver.exe");
			driver= new ChromeDriver();
		} 
		else if(browserName.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://Users//kgottipati.WDIINDIA//Documents//FireFoxDriver.exe");
			//driver= new FirefoxDriver();
		}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

			driver.get(prop.getProperty("paytmurl"));

			// applicationFunctions = new ApplicationFunctions(driver);
			generalFunctions = new GeneralFunctions(driver);
			bookOnPaytmNavigationBar = new BookOnPaytmNavigationBar();
			topNavigationBar = new TopNavigationBar();
			bookFlightsPage = new BookFlightsPage();

		}
	
}