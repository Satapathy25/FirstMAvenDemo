package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	/**
	 * Click the element
	 * @param prop
	 */
	public void click(By prop) {
		new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).click();
	}
	/**
	 * Enter data in textbox
	 * @param prop
	 * @param testData
	 */
	public void enterText(By prop,String testData) {
		new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(prop));
		clearValueFromTextBox(prop);
		driver.findElement(prop).sendKeys(testData);;
	}
	/**
	 * Get the alone text from application
	 * @param prop
	 * @return
	 */
	public String getText(By prop) {
		new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(prop));
		return	driver.findElement(prop).getText();
	}
	/**
	 * Get Attribute Value
	 * @param prop
	 * @param attribute
	 * @return
	 */
	public String getAttributeValue(By prop,String attribute) {
		return	driver.findElement(prop).getAttribute(attribute);
	}
	
	public void selectValueFromDropDown(By prop,int index) {
		new Select(driver.findElement(prop)).selectByIndex(index);
	}
	
	public void selectValueFromDropDown(By prop,String value) {
		new Select(driver.findElement(prop)).selectByValue(value);;
	}
	/**
	 * Accept the alert
	 */
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	/**
	 * Cancel the alert
	 */
	public void cancelAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public void clearValueFromTextBox(By prop) {
		driver.findElement(prop).clear();
	}
}
