package com.pom.base;

public class BookOnPaytmNavigationBar {

	public void clickOnMovies() {
		GeneralFunctions.waitAndFindElement(ObjectRepositories.Movies.clickOnMoviesButton_xpath, 30).click();
	}

	public void clickOnFlights() {
//		GeneralFunctions.waitAndFindElement(ObjectRepositories.Flights.clickOnFlightsButton_xpath, 30).click();
		GeneralFunctions.clickButton(ObjectRepositories.Flights.clickOnFlightsButton_xpath);
	}

	public void clickOnBus() {

	}

	public void clickOnTrain() {

	}

	public void clickOnHotels() {

	}

	public void clickOnCarsAndBikes() {

	}

	public void clickOnGiftVochours() {

	}

}
