package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {

	// Constructor: accepts the FirefoxDriver instance and assigns it to the
	// class-level driver
	public LoginPage(FirefoxDriver driver) {
		this.driver = driver; // Passes the WebDriver from the test or previous page to this page
	}

	// Method to enter the username in the login form
	public LoginPage enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname); // Locates the username field and types the value from
																// the test
		return this; // Returns the same page object to allow method chaining (fluent interface)
	}

	// Method to enter the password in the login form
	public LoginPage enterPassword(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword); // Locates the password field and types the value from
																// the test
		return this; // Returns the same page object for method chaining
	}

	// Method to click the login button and navigate to the WelcomePage
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click(); // Clicks the login button to submit the form
		WelcomePage wp = new WelcomePage(driver); // Initializes the next page object with the same driver
		return wp; // Returns the WelcomePage object for further steps
	}
}
