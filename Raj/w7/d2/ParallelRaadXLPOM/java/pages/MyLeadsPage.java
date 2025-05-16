package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {

	// Initialises the driver by accepting the driver instance from the calling
	public MyLeadsPage(FirefoxDriver driver) {

		// Assign the passed driver to the global driver in BaseClass
		this.driver = driver;
	}

	// Method to click the "Create Lead" link and navigate to the CreateLeadPage
	public CreateLeadPage clickCreateLeadLink() {

		// Clicks on the "Create Lead" link
		driver.findElement(By.linkText("Create Lead")).click();

		// Returns a new instance of CreateLeadPage with the same driver
		return new CreateLeadPage(driver);
	}
}
