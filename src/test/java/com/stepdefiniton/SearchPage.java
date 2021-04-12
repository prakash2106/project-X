package com.stepdefiniton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AdactinBase.BaseClassProject;

public class SearchPage extends BaseClassProject {

	// in constructor initiate elements in the page to driver

	public SearchPage() {
		PageFactory.initElements(driver, this);

	}

	// step 1 deriving the object with anotation

	@FindBy(xpath = "//select[@id='location']")
	public WebElement location;

	// generate getter
	public WebElement getLocation() {
		return location;
	}

	@FindBy(xpath = "//select[@id='hotels']")
	public WebElement hotels;

	@FindBy(xpath = "//select[@id='room_type']")
	public WebElement room;

	@FindBy(xpath = "//select[@id='room_nos']")
	public WebElement roomNo;

	@FindBy(xpath = "//input[@id='datepick_in']")
	public WebElement datePickIn;

	@FindBy(xpath = "//input[@id='datepick_out']")
	public WebElement datePickOut;

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getDatePickIn() {
		return datePickIn;
	}

	public WebElement getDatePickOut() {
		return datePickOut;
	}

	public WebElement getAdultPerRoom() {
		return AdultPerRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	@FindBy(xpath = "//select[@id='adult_room']")
	public WebElement AdultPerRoom;

	@FindBy(xpath = "//select[@id='child_room']")
	public WebElement childRoom;

	@FindBy(id = "Submit")
	public WebElement searchsubmit;

	public WebElement getSearchsubmit() {
		return searchsubmit;
	}

	public void secondPage(String location, String hotel, String roomType, String numberOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) throws Exception {
		dropDown(getLocation(), "visibleText", location);
		dropDown(getHotels(), "visibleText", hotel);
		dropDown(getRoom(), "visibleText", roomType);
		dropDown(getRoomNo(), "visibleText", numberOfRooms);
		// enterText(getDatePickIn(), checkInDate);
		// enterText(getDatePickOut(), checkOutDate);
		enterText(getDatePickIn(), checkInDate);
		enterText(getDatePickOut(), checkOutDate);
		dropDown(getAdultPerRoom(), "visibleText", adultsPerRoom);
		dropDown(getChildRoom(), "visibleText", childrenPerRoom);

	}

}
