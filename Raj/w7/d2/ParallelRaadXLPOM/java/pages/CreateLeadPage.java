package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {

	// Constructor: Accepts the FirefoxDriver instance and assigns it to the global
	// driver
	public CreateLeadPage(FirefoxDriver driver) {
		// Allows this page to use the same driver as the previous page
		this.driver = driver;
	}

	// Method to enter the company name in the "Create Lead" form
	public CreateLeadPage enterCompanyName(String cname) {
		// Types the company name into the input field
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		// Returns the current page object for method chaining
		return this;
	}

	// Method to enter the first name in the "Create Lead" form
	public CreateLeadPage enterFirstName(String fname) {
		// Types the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		// Enables fluent method chaining
		return this;
	}

	// Method to enter the last name in the "Create Lead" form
	public CreateLeadPage enterLastName(String lname) {
		// Types the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		// Returns current instance for chaining
		return this;
	}

	// Method to click the "Create Lead" button and navigate to the ViewLeadPage
	public ViewLeadPage clickCreateLeadButton() {
		// Clicks the submit button to create the lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		// Navigates to the next page and returns its object
		return new ViewLeadPage(driver);
	}
}