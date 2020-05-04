package com.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dao.CreateUserBean;
import com.dao.EditUserBean;
import com.dao.SetData;
import com.pages.CreateAccountPage;
import com.pages.LandingPage;
import com.pages.MyAccountPage;
import com.pages.SignInPage;
import com.util.TestBase;

import net.bytebuddy.utility.RandomString;

public class S235_Create_Account extends TestBase{
	
	WebDriver driver;
	LandingPage landingPage;
	/**
	 * Driver Catched in Test Case Class
	 */
	@BeforeMethod
	public void setUp() {
		
		//Browser Launch Up Code
		 driver=intilizeDriver();
		System.out.println("Driver From Create Account Test :"+driver);
		//String a="some method";
		//Enter URL
		 landingPage=enterURL(AUTOMATION_PRACTICE_URL);
		
	}
	/**
	 * From Test Case Class to Passing Pages classes using Constructor
	 * @throws InterruptedException 
	 */
	@Test
	public void createAccountTestCase() throws InterruptedException {
		SignInPage signInPage=landingPage.clickSignin();
		CreateUserBean createUserBean=new CreateUserBean();
		new SetData().createUserData(createUserBean);
		signInPage.enterEmailAddress(createUserBean);
		CreateAccountPage createAccountPage=signInPage.clickCreateAccountButton();
		createAccountPage.createUser(createUserBean);
		MyAccountPage myAccountPage=createAccountPage.clickRegisterButton();
		Assert.assertEquals(myAccountPage.getUserNameText(), createUserBean.getFirstName()+" "+createUserBean.getLastName());
		
	}
	
	//@Test
	public void createAccountTestCaseWithOnlyMandatoryFields() throws InterruptedException {
	  SignInPage signInPage=landingPage.clickSignin();
		CreateUserBean createUserBean=new CreateUserBean();
		EditUserBean editUserBean=new EditUserBean();
		new SetData().createUserData(createUserBean);
		new SetData().setEditAccountData(editUserBean);
		signInPage.enterEmailAddress(createUserBean);
		CreateAccountPage createAccountPage=signInPage.clickCreateAccountButton();
		createAccountPage.createUser(createUserBean);
		MyAccountPage myAccountPage=createAccountPage.clickRegisterButton();
		Assert.assertEquals(myAccountPage.getUserNameText(), createUserBean.getFirstName()+" "+createUserBean.getLastName());
		
		
		
	}
}
