package hw.w3.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CRSS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("TomParker");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Bowl");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TomParker");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bowl");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("fdsfdsfsdfasa");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hterhe@fd.com");
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		new Select (stateProvince).selectByValue("NY");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("fshdfbhb");
		driver.findElement(By.className("smallSubmit")).click();
		String getTitle = driver.getTitle();
		System.out.println("Page title is: " + getTitle);
		Thread.sleep(3000);
		}

}
