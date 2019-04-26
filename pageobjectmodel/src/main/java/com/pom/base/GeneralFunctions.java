package com.pom.base;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.ITestResult;

import com.google.common.base.Function;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class GeneralFunctions {
	static WebDriver driver;
	static String testCaseName;
	static ExtentReports extent;

	public GeneralFunctions(WebDriver driver) {
		this.driver = driver;
	}

	/*---- waitAndFindElement is a method to wait for few seconds for finding an element */
	public static WebElement waitAndFindElement(final By objlocator, int timeoutInSeconds) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeoutInSeconds, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.SECONDS) // .withTimeout(Duration.ofSeconds(timeoutInSeconds)).pollingEvery(Duration.ofSeconds(10))
				.withMessage("Custom message").ignoring(NoSuchElementException.class);
		WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(objlocator);
			}
		});
		return webElement;
	}

	/*----clickButton is a method to click the buttons, textboxes-----*/
	public static boolean clickButton(By objlocator) {
		try {
			waitAndFindElement(objlocator, 30).click();
			Base.test.log(LogStatus.INFO, "Clicking on " + objlocator);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void switchToFrame(By objlocator) {   //Ref: https://stackoverflow.com/questions/9942928/how-to-handle-iframe-in-selenium-webdriver-using-java
		
		List<WebElement> listFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("list frames   "+listFrames.size());
		WebElement element = driver.findElement(objlocator);
		driver.switchTo().frame(element);
	}
	

	public static List<WebElement> listOfElements(By objlocator) {
		try {
			// List<WebElement> listOfWebElements = (List<WebElement>)
			// waitAndFindElement(objlocator, 30);

			List<WebElement> listOfWebElements = driver.findElements(objlocator);
			for (int i = 0; i < listOfWebElements.size(); i++) {
				System.out.println("List of elements = " + listOfWebElements.get(i).getText());
			}
			return listOfWebElements;
		} catch (Exception e) {
			return null;
		}
		

	}
	
	public boolean dropdownlist(By objlocator) {
		WebElement dropDownElement = waitAndFindElement(objlocator, 30);
		Select dropdowns = new Select(dropDownElement);

		List<WebElement> dropdown = dropdowns.getOptions();
		for (int i = 0; i < dropdown.size(); i++) {
			System.out.println(dropdown.get(i).getText());
		}

		List<WebElement> options = dropdowns.getOptions();
		for (WebElement option : options) {
			if ("String".equals(option.getText()))
				option.click();
		}
		return false;

	}

	/*------ takeScreenshot method is used to take the screenshot of the page*/
	public static String takeScreenshot(String testCaseName) {
		Date d = new Date();
		String screenshotName = testCaseName + "_" + d.toString().replace(":", "_").replace(" ", "_");
		// System.out.println("krishna = " + screenshotName);
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(Screenshot, new File(
					System.getProperty("user.dir") + "/test-output/html/screenshots/" + screenshotName + ".jpg"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		return screenshotName;
	}

	/*---- takeScreenshot method is used to take the screenshot of the element of the page----*/
	public static void takeScreenshot(String output, By objlocator) {
		Date d = new Date();
		String fileName = "ElementScreenshot_ " + output + " " + d.toString().replace(":", "_").replace(" ", "_");
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			BufferedImage fullImage = ImageIO.read(Screenshot);
			WebElement element = driver.findElement(objlocator);
			// Point point = element.getLocation();
			int elementWidth = element.getSize().getWidth();
			int elementHeight = element.getSize().getHeight();

			BufferedImage myElementScreenshot = fullImage.getSubimage(element.getLocation().getX(),
					element.getLocation().getY(), elementWidth, elementHeight);
			ImageIO.write(myElementScreenshot, "jpg", Screenshot);
			FileUtils.copyFile(Screenshot, new File("D://" + fileName + ".jpg"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static ExtentReports getInstance() {
		if (extent == null) {
			extent = new ExtentReports(System.getProperty("user.dir") + "\\test-output\\html\\extent.html");
			extent.loadConfig(new File(System.getProperty("user.dir")+ "\\src\\test\\resources\\com\\pom\\extentconfig\\extentReportConfig.xml"));
			
		}
		return extent;

	}


}
