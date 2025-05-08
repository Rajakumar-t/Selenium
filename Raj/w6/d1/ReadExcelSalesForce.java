package hw.w6.d1;

import java.io.IOException;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelSalesForce extends BaseClassSalesForce{
	
	@DataProvider(name="readdataexcel")
	public String[][] readdataexcel() throws IOException {
		String[][] data = ReadExcelForTwoStringCreatLead.readData();
			return data;
	}
	
	
	@Test(dataProvider= "readdataexcel")
	public void runCreatLead(String companyName, String firstName, String lastName) throws InterruptedException {

		driver.findElement(By.linkText("Create Lead")).click();

		//Enter the companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);

        //Enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

        //Enter the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}
		
}
