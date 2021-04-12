package com.stepdefiniton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AdactinBase.BaseClassProject;

public class BookHotel extends BaseClassProject {

	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	public WebElement firstName;

	@FindBy(id = "last_name")
	public WebElement lastName;

	@FindBy(id = "address")
	public WebElement address;

	@FindBy(id = "cc_num")
	public WebElement creditCardNo;

	@FindBy(id = "cc_type")
	public WebElement creditCardType;

	@FindBy(id = "cc_exp_month")
	public WebElement pickMonth;

	@FindBy(id = "cc_exp_year")
	public WebElement pickYear;

	@FindBy(id = "cc_cvv")
	public WebElement cvvNo;

	@FindBy(id = "book_now")
	public WebElement bookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getPickMonth() {
		return pickMonth;
	}

	public WebElement getPickYear() {
		return pickYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public void details(String firstName, String lastname, String address, String creditCardNo, String creditCardType,
			String pickMonth, String pickYear, String cvvNo) throws Exception {
		enterText(getFirstName(), firstName);
		enterText(getLastName(), lastname);
		enterText(getAddress(), address);
		enterText(getCreditCardNo(), creditCardNo);
		dropDown(getCreditCardType(), "visibleText", creditCardType);
		dropDown(getPickMonth(), "visibleText", pickMonth);
		dropDown(getPickYear(), "visibleText", pickYear);
		enterText(getCvvNo(), cvvNo);

	}
}
