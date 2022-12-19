package com.hrm.TYSS.ObjectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.TYSS.GenericUtility.ExcelUtility;

public class ApplyLeavePage {
	public  ApplyLeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']") private WebElement LeaveType;
	@FindBy(xpath = "//span[text()='CAN - Bereavement']") private WebElement SelectLeaveType;
	@FindBy(xpath = "//label[.='From Date']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-date-wrapper']") private WebElement FromDate;
	@FindBy(xpath = "//div[text()='30']") private WebElement SelectDate;
	@FindBy(xpath = "//label[.='To Date']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-date-wrapper']") private WebElement ToDate;
	@FindBy(xpath = "//ul[@class='oxd-calendar-selector']/following-sibling::button[@class='oxd-icon-button']") private WebElement ClcikOnNext;
	@FindBy(xpath = "//div[text()='1']") private WebElement SelectToDate;
	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']") private WebElement comments;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ApplyButton;


	public WebElement getLeaveType() {
		return LeaveType;
	}


	public WebElement getSelectLeaveType() {
		return SelectLeaveType;
	}


	public WebElement getFromDate() {
		return FromDate;
	}

	

	public WebElement getSelectDate() {
		return SelectDate;
	}


	public WebElement getToDate() {
		return ToDate;
	}


	public WebElement getClcikOnNext() {
		return ClcikOnNext;
	}


	public WebElement getSelectToDate() {
		return SelectToDate;
	}


	public WebElement getComments() {
		return comments;
	}


	public WebElement getApplyButton() {
		return ApplyButton;
	}


	public void Applyleave() throws IOException, Throwable {
		ExcelUtility elib=new ExcelUtility();
		String comment = elib.GetTheDataFromExcelSheet("Leave", 1, 0);
		LeaveType.click();
		SelectLeaveType.click();
		FromDate.click();
		SelectDate.click();
		ToDate.click();
		SelectToDate.click();
		comments.sendKeys(comment);
		ApplyButton.click();

	}
}
