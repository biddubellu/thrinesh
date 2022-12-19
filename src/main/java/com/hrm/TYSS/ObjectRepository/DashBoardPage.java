package com.hrm.TYSS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Leave']") private WebElement leaveMajortab;

	public WebElement getLeaveMajortab() {
		return leaveMajortab;
	}
	
	public void ClickOnleaveMajortab() {
		leaveMajortab.click();
	}

}
