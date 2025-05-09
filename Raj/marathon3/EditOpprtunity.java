package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EditOpprtunity {
	public FirefoxDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Get Url
		driver.get("https://login.salesforce.com");

		// Enter Username & Password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("bhuvanesh.moorthy@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf@2025");
		// Click Login
		driver.findElement(By.xpath("//input[@id='Login']")).click();

		// Click on toggle menu button
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		// Click view All
		WebElement element = driver.findElement(By.xpath("//button[text()='View All']"));
		driver.executeScript("arguments[0].click()", element);
			//Thread.sleep(3000);


		// Click Sales from App Launcher
		WebElement element2 = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click()", element2);

		// Click on Opportunity tab
		WebElement opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click();", opportunities);
		Thread.sleep(4000);
		
		
		//WebElement element4 = driver.findElement(By.xpath("//input[@class='slds-input']"));
		//element4.sendKeys("Salesforce Automation");
		//element4.click();
		
		WebElement oppName = driver.findElement(By.xpath("//label[text()='Search this list...']//following::input[1]"));
		oppName.sendKeys("RamkumarRamaiah");
		Thread.sleep(2000);
		oppName.sendKeys(Keys.ENTER);
		
		
		
		
		
		

		

	

		// ,Keys.ENTER);

		// 6. Click on the Dropdown icon and Select Edit
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='showActionsButtonContainer'])[1]")).click();

		WebElement edit = driver.findElement(By.xpath("(//div[text()='Edit'])[1]"));
		driver.executeScript("arguments[0].click();", edit);

		Thread.sleep(3000);
		WebElement element1 = driver.findElement(
				By.xpath("(//button[contains(@class,'slds-button trigger slds-button_icon-border')])[4]//span[2]"));
		driver.executeScript("arguments[0].click();", element1);

		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//tr[2]/td[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@role='combobox']//span)[2]")).click();
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();

		Thread.sleep(3000);

		WebElement status = driver.findElement(By.xpath("//a[text()='Delivery Status']"));

		Actions delivery = new Actions(driver);
		delivery.scrollToElement(status).perform();

		driver.findElement(By.xpath("(//button[@role='combobox']//span)[4]")).click();

		driver.findElement(By.xpath("(//span[text()='In progress'])[1]")).click();

		Thread.sleep(3000);
		driver.executeScript("document.body.style.zoom='80%'", "");
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Salesforce");

		driver.findElement(By.xpath("//button[text()='Save']")).click();

		WebElement verify = driver.findElement(By.xpath("(//span[text()='Perception Analysis'])[3]"));

		System.out.println(verify.getText());

	}

}
