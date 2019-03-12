package com.pom.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;


public class GeneralFunctions {
	static WebDriver driver;
	public GeneralFunctions(WebDriver driver) {
		this.driver = driver;
	}


	/*---- waitAndFindElement is a method to wait for few seconds for finding an element */
	public static WebElement waitAndFindElement( final By objlocator, int timeoutInSeconds)
    {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        						.withTimeout(timeoutInSeconds, TimeUnit.SECONDS)
        						.pollingEvery(10, TimeUnit.SECONDS)  		//.withTimeout(Duration.ofSeconds(timeoutInSeconds)).pollingEvery(Duration.ofSeconds(10))
          						.withMessage("Custom message")
        						.ignoring(NoSuchElementException.class);
        WebElement webElement = wait.until(new Function<WebDriver, WebElement>() 
        	{
            	public WebElement apply(WebDriver driver) {
            		return driver.findElement(objlocator);
            }
        });
        return webElement;
    }
	
	/*----clickButton is a method to click the buttons, textboxes-----*/
	public static boolean clickButton(By objlocator) {

		try{
			waitAndFindElement(objlocator, 30).click();
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	
	public static boolean listOfElements(By objlocator) 
	{
		try {
			//List<WebElement> listOfWebElements =  (List<WebElement>) waitAndFindElement(objlocator, 30);
			
			List<WebElement> listOfWebElements = driver.findElements(objlocator);
			
			for(int i=0; i<listOfWebElements.size();i++) 
				{
					System.out.println("List of elements = " + listOfWebElements.get(i).getText());
				//	System.out.println("ada");
					
				}return true;	
			}
		catch(Exception e) {
					return false;
			}
		
	}
	
	public boolean dropdownlist(By objlocator)
	{
		WebElement dropDownElement = waitAndFindElement(objlocator,30);
		Select dropdowns = new Select(dropDownElement);
		
		List<WebElement> dropdown = dropdowns.getOptions();
		for(int i=0; i<dropdown.size(); i++) {
			System.out.println(dropdown.get(i).getText());
			
		}
		
		
		List<WebElement> options = dropdowns.getOptions();
		for (WebElement option : options) {
		    if("String".equals(option.getText()))
		        option.click();  
		}
		
		return false;
		
	}
	
	
	}
		



