package com.hrm.TYSS.GenericUtility;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	
	/**
	 * 
	 * @param driver
	 */
	public void MaximizeWindow(WebDriver driver) {	
		driver.manage().window().maximize();
	}
	/**
	 * 
	 */
	public void WaitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Iconstants.ImplicitWaitTime));
	}

	public void WaitTillElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Iconstants.ExplicitWaitTime));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void WaitTillElementToBeVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Iconstants.ExplicitWaitTime));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void WaitTillPageLoadURL(WebDriver driver, String url) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Iconstants.ExplicitWaitTime));
		wait.until(ExpectedConditions.urlContains(url));
	}
	public void IgnoreNoSuchelementException(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Iconstants.ExplicitWaitTime));
		wait.ignoring(NoSuchElementException.class);
	}
	
	public void WaitForElementToCustom(WebDriver driver, int pollingtime, WebElement element) {
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(pollingtime));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void MouseHoverOnElement(WebElement element, WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public void RightClickOnElement(WebElement element, WebDriver driver) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	
	public void RightClickOnPage(WebDriver driver) {
		Actions action=new Actions(driver);
		action.contextClick().perform();
	}
	
	public void DoubleClick( WebDriver driver) {
		Actions action=new Actions(driver);
		action.doubleClick().perform();
	}
	
	public void DoubleClickOnElement( WebElement element, WebDriver driver) {
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
	}
	
	public void SelectByVisibleText(WebElement element, String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void SelectByIndex(WebElement element, int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void SelectByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.deselectByValue(value);
	}
	
	public void ScrollBar(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
				
	}
	

}
