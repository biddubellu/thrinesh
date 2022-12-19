package com.hrm.TYSS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
	public LeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[.='Apply']") private WebElement LeaveButton;
	
	

	public WebElement getLeaveButton() {
		return LeaveButton;
	}
public void clickLeaveButton() {
	LeaveButton.click();
	}

}
