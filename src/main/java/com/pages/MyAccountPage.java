package com.pages;

import org.openqa.selenium.WebDriver;

import com.objrepo.MyAccountPageProeprties;
import com.util.WebDriverUtils;

public class MyAccountPage extends WebDriverUtils implements MyAccountPageProeprties{

	WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public String getUserNameText() {
		return getText(USERNAME_LOCATOR);
	}
	
}
