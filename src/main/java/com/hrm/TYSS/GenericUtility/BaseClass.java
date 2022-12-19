package com.hrm.TYSS.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.hrm.TYSS.ObjectRepository.LoginPage;
import com.hrm.TYSS.ObjectRepository.LogoutPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected WebDriver driver=null;
	
	@BeforeClass
	public void LaunchTheBrowser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		WebdriverUtility wlib=new WebdriverUtility();
		wlib.MaximizeWindow(driver);
		wlib.WaitForPageToLoad(driver);
		FileUtility file=new FileUtility();
		String URL = file.getTheDataFromPropertyFile("url");
		driver.get(URL);
		}
	
	@BeforeMethod
	public void LoginToApplication() throws Throwable {
		LoginPage login=new LoginPage(driver);
		login.Login();
	}
	
	@AfterMethod
	public void LogoutFromApplication() {
		LogoutPage logout=new LogoutPage(driver);
		logout.Logout();
	}
	
	@AfterClass
	public void CloseTheBrowser() {
		driver.quit();
	}
	
}