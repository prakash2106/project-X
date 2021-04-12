package com.stepdefiniton;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import AdactinBase.BaseClassProject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClassProject {
	@Given("user is on the Adactin page")
	public void user_is_on_the_Adactin_page() {
		getdriver();
		launchUrl("https://adactinhotelapp.com/index.php");
	}

	@When("user should enter the {string} and {string}")
	public void user_should_enter_the_and(String userName, String password) {
		LoginPage page = new LoginPage();
		enterText(page.getTxtUsername(), userName);
		enterText(page.getTxtPassword(), password);
	}

	@Then("user should click the login button")
	public void user_should_click_the_login_button() {
		LoginPage page = new LoginPage();
		btnClick(page.getClkButton());
	}

	@Then("user should verify the search hotel")
	public void user_should_verify_the_search_hotel() {
		String currentUrl = driver.getCurrentUrl();
		boolean b = currentUrl.contains("SearchHotel");
		Assert.assertTrue("verify url", b);

	}

	@Then("user should enter the details in search hotel")
	public void user_should_enter_the_details_in_search_hotel(io.cucumber.datatable.DataTable dataTable)
			throws Exception {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);

		SearchPage sp = new SearchPage();
		sp.secondPage(map.get("location"), map.get("hotel"), map.get("roomType"), map.get("numberOfRooms"),
				map.get("checkInDate"), map.get("checkOutDate"), map.get("adultsPerRoom"), map.get("childrenPerRoom"));
//String location, String hotels,String roomType,String  numberOfRooms,String  checkInDate,String  checkOutDate,String  adultsPerRoom,String childrenPerRoom
	}

	@Then("user should click the search button")
	public void user_should_click_the_search_button() {
		SearchPage sp = new SearchPage();
		btnClick(sp.getSearchsubmit());

	}

	@Then("user should click on radiobutton")
	public void user_should_click_on_radiobutton() {
		SelectHotel sh = new SelectHotel();
		btnClick(sh.getSelectButton());

	}

	@Then("user should click on continue button")
	public void user_should_click_on_continue_button() {
		SelectHotel sh = new SelectHotel();
		btnClick(sh.getContinueClk());
	}

	@Then("user should enter the details in book hotel")
	public void user_should_enter_the_details_in_book_hotel(io.cucumber.datatable.DataTable dataTable)
			throws Exception {
		List<Map<String, String>> list = dataTable.asMaps();
		Map<String, String> map = list.get(0);
		// String string = map.get(0);
		BookHotel bh = new BookHotel();
		bh.details(map.get("firstName"), map.get("lastname"), map.get("billingAddress"), map.get("creditCardNo"),
				map.get("creditCardType"), map.get("expiryMonth"), map.get("expiryYear"), map.get("cvv"));
	}

	@Then("user should click on bookNow button")
	public void user_should_click_on_bookNow_button() {
		BookHotel bh = new BookHotel();
		btnClick(bh.getBookNow());
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		BookingConfirmation bc=new BookingConfirmation();
		bc.getOrderId();
		
	}

}