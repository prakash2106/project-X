package com.stepdefiniton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AdactinBase.BaseClassProject;

public class BookingConfirmation extends BaseClassProject{
	public BookingConfirmation() {
	PageFactory.initElements(driver,this );
	}
	@FindBy(id="hotel_name")
public WebElement Hotel;
	
	@FindBy(id="order_no")
	public WebElement orderNo;

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	public void getOrderId() {
		String attribute = attribute(getOrderNo(), "value");
		System.out.println(attribute);

	}
	
}
	


