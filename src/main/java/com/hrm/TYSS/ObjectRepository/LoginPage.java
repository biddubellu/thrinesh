 package com.hrm.TYSS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.TYSS.GenericUtility.ExcelUtility;
import com.hrm.TYSS.GenericUtility.FileUtility;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']") private WebElement userNameTextField;
	@FindBy(xpath = "//input[@name='password']") private WebElement passwordTextField;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void Login() throws Throwable {
		FileUtility file=new FileUtility();
		String Username = file.getTheDataFromPropertyFile("username");
		String Password = file.getTheDataFromPropertyFile("password");
		userNameTextField.sendKeys(Username);
		passwordTextField.sendKeys(Password);
		loginButton.click();
	}
	
	
	

}
