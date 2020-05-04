package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dao.CreateUserBean;
import com.objrepo.CreateAccountPageProperties;
import com.util.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProperties {

	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterFirstName(CreateUserBean createUserBean) {
		enterText(FIRSTNAME_LOCATOR,createUserBean.getFirstName());
	}
	
	public void enterLastName(CreateUserBean createUserBean) {
		enterText(LASTNAME_LOCATOR,createUserBean.getLastName());
	}
	
	public void enterPassword(CreateUserBean createUserBean) {
		enterText(PASSWORD_LOCATOR, createUserBean.getPassword());
	}
	
	public void enterAddress(CreateUserBean createUserBean) {
		enterText(ADDRESS_LOCATOR, createUserBean.getAddress());
	}
	
	public void enterCity(CreateUserBean createUserBean) {
		enterText(CITY_LOCATOR, createUserBean.getCity());
	}
	
	public void selectState(CreateUserBean createUserBean) {
		selectValueFromDropDown(STATE_LOCATOR, createUserBean.getState());
	}
	
	public void enterZipcode(CreateUserBean createUserBean) {
		enterText(ZIPCODE_LOCATOR, createUserBean.getZipcode());
	}
	
	public void enterPhoneNumber(CreateUserBean createUserBean) {
		enterText(PHONENUMBER_LOCATOR, createUserBean.getPhoneNumber());
	}
	
	public void enterAlias(CreateUserBean createUserBean) {
		
		enterText(ALIAS_LOCATOR, createUserBean.getAlias());
	}
	
	public MyAccountPage clickRegisterButton() {
		click(REGISTERBUTTON_LOCATOR);
		return new MyAccountPage(driver);
	}

	
	public void createUser(CreateUserBean createUserBean) {
		
		enterFirstName(createUserBean);
		enterLastName(createUserBean);
		enterPassword(createUserBean);
		enterAddress(createUserBean);
		enterCity(createUserBean);
		selectState(createUserBean);
		enterZipcode(createUserBean);
		enterPhoneNumber(createUserBean);
		enterAlias(createUserBean);
		
		
	}
	
	
	
	
	
	public void enterHomePhone(String homePhoneNo) {
		//enterText(HOMEPHONE_LOCATOR, homePhoneNo);
	}

	
}
