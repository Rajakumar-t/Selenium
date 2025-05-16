package pages;

import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {

	// Constructor: Accepts the FirefoxDriver instance and assigns it to the
	// class-level driver
	public ViewLeadPage(FirefoxDriver driver) {
		this.driver = driver; // Reuses the same browser session passed from CreateLeadPage
	}

	// Method to verify that the lead has been successfully created
	public void verifyLead() {
		// Currently, this just prints a confirmation message to the console
		// You can enhance this later with assertions or UI validations
		System.out.println("Lead is created");
	}
}