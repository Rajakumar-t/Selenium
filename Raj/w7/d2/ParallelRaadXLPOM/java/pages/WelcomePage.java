package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass {

	// Constructor: Accepts the FirefoxDriver instance and assigns it to the
	// class-level driver
	public WelcomePage(FirefoxDriver driver) {
		this.driver = driver; // Reuses the WebDriver instance from the previous page (LoginPage)
	}

	// Method to click on the "CRM/SFA" link and navigate to the MyHomePage
	public MyHomePage clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click(); // Locates and clicks the CRM/SFA link
		return new MyHomePage(driver); // Returns a new instance of MyHomePage to continue navigation
	}

	// Method to log out of the application and return to the LoginPage
	public LoginPage logout() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); // Clicks the logout button
		return new LoginPage(driver); // Returns to the LoginPage after logout
	}
}