package com.stepdefiniton;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import AdactinBase.BaseClassProject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClassProject {
	public  WebDriver driver;
	 @Given("user is on the Adactin page")
	 public void user_is_on_the_Adactin_page() {
     getdriver();
     launchUrl("https://adactinhotelapp.com/index.php");
	  }

	 @When("user should enter the {string} and {string}")
	 public void user_should_enter_the_and(String userName, String password) {
		 LoginPage page=new LoginPage();
       enterText(page.getTxtUsername(), userName);
       enterText(page.getTxtPassword(), password);
	 }

	 @Then("user should click the login button")
	 public void user_should_click_the_login_button() {
		 LoginPage page=new LoginPage();
		 btnClick(page.getClkButton());
	 }

	 @Then("user should verify the search hotel")
	 public void user_should_verify_the_search_hotel() {
      String currentUrl = driver.getCurrentUrl();
      boolean b = currentUrl.contains("SearchHotel");
      Assert.assertTrue("verify url", b);
		 
	 }

	 @Then("user should search hotel {string},{string},{string},{string},{string},{string},{string}and{string}")
	 public void user_should_enter_the_book_hotel_and(String location, String hotel,String room,String roomNo,String datePickIn,String datePickOut,String AdultPerRoom,String childRoom, io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<Map<String,String>> asMaps = dataTable.asMaps();
        Map<String, String> map = asMaps.get(0);
        		 SearchPage sp=new SearchPage();
     sp.secondPage(location, hotel, room, roomNo, datePickIn, datePickOut, AdultPerRoom, childRoom);
     
	 }

	 @Then("user should click the search button")
	 public void user_should_click_the_search_button() {
		 SearchPage sp=new SearchPage();
		 btnClick(sp.getSearchsubmit());

	 }

	 @Then("user should click on radiobutton")
	 public void user_should_click_on_radiobutton() {
      SelectHotel sh=new SelectHotel();
      btnClick(sh.getSelectButton());
     
	 }

	 @Then("user should click on continue button")
	 public void user_should_click_on_continue_button() {
		 SelectHotel sh=new SelectHotel();
		 btnClick(sh.getContinueClk());
	 }

	 @Then("user should enter the book hotel{string},{string},{string},{string},{string},{string},{string}and{string}")
	 public void user_should_enter_the_book_hotel_and1(String firstName,String lastName,String address,String creditCardNo,String creditCardType,String pickMonth,String pickYear,String cvvNo, io.cucumber.datatable.DataTable dataTable) throws Exception {
      List<Map<String,String>> list = dataTable.asMaps();
      Map<String, String> map = list.get(0);
      String string = map.get(0);
      BookHotel bh=new BookHotel();
      bh.details(firstName, lastName, address, creditCardNo, creditCardType, pickMonth, pickYear, cvvNo);
      	 }

	 @Then("user should click on bookNow button")
	 public void user_should_click_on_bookNow_button() {
		 BookHotel bh=new BookHotel();
     btnClick(bh.getBookNow());
	 }


	 
}