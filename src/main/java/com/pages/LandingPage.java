package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.objrepo.LandingPageProperties;
import com.util.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProperties {

	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public SignInPage clickSignin() {
		//Here is the code for click signin
		click(SIGNIN_LOCATOR);
		return new SignInPage(driver);
		
	}
	public void clickContactUS() {
		//Here is the code for click signin
		System.out.println("Clicked contactus link");
	}
	public void searchIteam() {
		
	}
}
