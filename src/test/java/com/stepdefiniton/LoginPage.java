package com.stepdefiniton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AdactinBase.BaseClassProject;

public class LoginPage extends BaseClassProject {
		public LoginPage() {
	PageFactory.initElements(driver, this);
		}
			
		@FindBy(id="username")
		private WebElement txtUsername;
	 
		@FindBy(id="password")
		private WebElement txtPassword;
		 
		@FindBy(id="login")
		  private WebElement clkButton;
			
		
		public WebElement getTxtUsername() {
			return txtUsername;
		}

		public WebElement getTxtPassword() {
			return txtPassword;
		}

		public WebElement getClkButton() {
			return clkButton;
		}

		
		
	}



