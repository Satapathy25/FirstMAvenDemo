package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.util.TestBase;

public class S345_Edit_Account extends TestBase{

	@BeforeMethod
	public void setUp() {
		
		//Browser Launch Up Code
		intilizeDriver();
		enterURL(AUTOMATION_PRACTICE_URL);
	}
	
	@Test
	public void editAccountTestCase() {
		
		//Browser Launch Code
	}
	
	@Test
	public void editAccountTestCaseWithOnlyMandatoryFields() {
		
		//Browser Launch up
	}

}
