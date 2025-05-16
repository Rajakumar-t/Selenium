package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	 // Constructor: Accepts the driver instance and assigns it to the class-level driver
    public MyHomePage(FirefoxDriver driver) {
        this.driver = driver;  // Allows reuse of the same browser session across pages
    }

    // Method to click on the "Leads" link and navigate to the MyLeadsPage
    public MyLeadsPage clickLeadsLink() {
        driver.findElement(By.linkText("Leads")).click();  // Locates and clicks the "Leads" link
        return new MyLeadsPage(driver);  // Returns a new instance of MyLeadsPage with the current driver
    }
}