package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LandingPage;

public class TestBase implements Setup{

	WebDriver driver;
	/**
	 * Creating Driver Object and Returning the same
	 * @return
	 */
	public WebDriver intilizeDriver() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Driver From Test Base :  Intlize Driver Method "+driver);
		return driver;
	}
	
	
	public LandingPage enterURL(String url) {
		System.out.println("Driver From Test Base : Enter URL Method "+driver);
		driver.get(url);
		return new LandingPage(driver);
	}
}
