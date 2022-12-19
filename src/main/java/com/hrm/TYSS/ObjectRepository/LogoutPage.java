package com.hrm.TYSS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']") private WebElement userProfile;
	@FindBy(xpath = "//a[.='Logout']") private WebElement logoutTab;
	
	public WebElement getUserProfile() {
		return userProfile;
	}
	public WebElement getLogoutTab() {
		return logoutTab;
	}
	
	public void Logout() {
		userProfile.click();
		logoutTab.click();
	}
	
	
	
	
}
