package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	public MyLeadsPage (FirefoxDriver driver) {
		this.driver = driver;
		}

	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}

} 
