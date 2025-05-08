package hw.w3.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteLead {

	public static <Webelement> void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("44");
		//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("067847835");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement leadElement = driver.findElement(By.xpath("//a[text()='Saranya'][1]"));
		String leadName = leadElement.getText();
		System.out.println("First Lead name: "+leadName);
		leadElement.click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		WebElement leadElement1= driver.findElement(By.xpath("//a[text()=Saranya]"));
		String leadName1 = leadElement1.getTagName();
		System.out.println(leadName1);
		if(leadName!=leadName1) {
			System.out.println("No records to display");
			driver.close();
		}
	}

}
