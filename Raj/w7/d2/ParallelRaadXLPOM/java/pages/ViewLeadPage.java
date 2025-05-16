package pages;

import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	
	public ViewLeadPage (FirefoxDriver driver) {
		this.driver= driver;
	}

	

	public void verifyLead() {
		System.out.println("Lead is created");

	}

}
