package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dao.CreateUserBean;
import com.objrepo.SigninPageProperties;
import com.util.WebDriverUtils;

public class SignInPage extends WebDriverUtils implements SigninPageProperties{

	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void enterEmailAddress(CreateUserBean createUserBean) {
		enterText(EMAIL_ADDRESS_LOCATOR, createUserBean.getEmailAddress());
	}

	public CreateAccountPage clickCreateAccountButton( ) {
		click(CREATEACCOUNT_LOCATOR);
		return new CreateAccountPage(driver);
	}

	public void enterLoginEmailAddress( ) {

	}

	public void enterLoginPassword( ) {

	}
	public void clickSignin( ) {

	}
	public void clickForgotPassword( ) {

	}
}
