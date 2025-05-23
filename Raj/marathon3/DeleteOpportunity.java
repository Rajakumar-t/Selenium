package marathon3;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DeleteOpportunity {
	public FirefoxDriver driver;

	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-notifications");

		FirefoxDriver driver = new FirefoxDriver(options);


		// Click Login
		driver.findElement(By.xpath("//input[@id='Login']")).click();

		// Click on toggle menu button
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		// Click view All
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		// Click Sales from App Launcher
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

		// Click on Opportunity tab
		WebElement opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click();", opportunities);
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[contains(@class,'test-listviewdisplayswitcher')]")).click();
		driver.findElement(By.xpath("//li[@title='Kanban']")).click();

		// 5. Search the Opportunity 'Salesforce Automation by *Your Name*'
		WebElement oppName = driver.findElement(By.xpath("//label[text()='Search this list...']//following::input[1]"));
		oppName.sendKeys("RamkumarRamaiah");
		Thread.sleep(2000);
		oppName.sendKeys(Keys.ENTER);

		// 6. Click on the Dropdown icon and Select Delete
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='showActionsButtonContainer'])[1]")).click();

		WebElement delete = driver.findElement(By.xpath("(//div[text()='Delete'])[1]"));
		driver.executeScript("arguments[0].click();", delete);

		driver.findElement(By.xpath("//span[text()='Delete']")).click();

	}

}
