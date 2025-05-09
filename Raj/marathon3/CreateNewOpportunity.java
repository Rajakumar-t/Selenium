package marathon3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateNewOpportunity extends BaseClass {

	@Parameters({ "url", "username", "password", "companyname", "description" })
	@Test
	public void parameteris(String url, String unmae, String pword, String companyname, String description) throws InterruptedException {


	// click the view button
		WebElement element = driver.findElement(By.xpath("//button[text()='View All']"));
		driver.executeScript("arguments[0].click()", element);
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//button[text()='View All']")).click();
			
//  Click Sales from App Launcher	
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click()", element2);
// Click on Opportunity tab 	
		Thread.sleep(3000);
		WebElement opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click();", opportunities);

// Click on New button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='New']")).click();

// Enter Opportunity name & Store it
		Thread.sleep(3000);
		WebElement oppName = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input[1]"));
		oppName.sendKeys("Ramkumar");
		
//Enter the amount as specified 
		//driver.find_element(By.XPATH, "//input[@name='Amount']").send_keys("75000")
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
// Choose close date as Today
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input[1]")).click();
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//tr[3]/td[7]")).click();
		// driver.findElement(By.xpath("//label[text()='Close
		// Date']/following::input[1]")).sendKeys("{{today}}");
// Select 'Stage' as Need Analysis
		Thread.sleep(3000);
		//(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[1]
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[1]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();

// click Save
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		//driver.findElement(By.xpath("//button[text()='Save']")).click();
// VerifyOppurtunity Name		
		Thread.sleep(3000);
		String verifymsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a"))
				.getAttribute("title");

		if (verifymsg.contains("Ramkumar")) {
			System.out.println("New Oppurtunity Created");
		} else {
			System.out.println("Oppurtunity not Created");
		}
	}
}
