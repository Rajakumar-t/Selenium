package marathonsession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ServicenowShaddow {

	public static void main(String[] args) throws InterruptedException, IOException {
		FirefoxDriver driver = new FirefoxDriver();
		
		// Getting the URL as requested & maximising the browser
		driver.get("https://dev186929.service-now.com/");
		driver.manage().window().maximize();

		// intput the inromation to login
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");

		// click login
		driver.findElement(By.id("sysverb_login")).click();

		// getting into Shadow Mode
		Shadow shadow = new Shadow(driver);
		
		//applying a shadow ImplicitWait to perform
		shadow.setImplicitWait(10);
		Thread.sleep(1000);
		WebElement all = shadow.findElementByXPath("div[text()='All']");
		all.click();
		Actions act = new Actions(driver);
		act.moveToElement(all).click().build();
		WebElement selecthover = shadow.findElementByXPath("//input[@id='filter']");
		selecthover.sendKeys("Service Catalog");
		Thread.sleep(1000);
		selecthover.sendKeys(Keys.ENTER);

		// switching frame
		WebElement iclick = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		// WebElement frameElement = shadow.findElement("gsft_main");
		driver.switchTo().frame(iclick);

		// Click on Mobile
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]"));
		driver.executeScript("arguments[0].click()", element);

		// select iphone 13 pro
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='details_div'])[2]")).click();

		// Select 'Yes' for Lost or Broken
		driver.findElement(By.xpath("//label[text()='Yes']")).click();

		// Enterphone number
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");

		// selecting unlimited package
		WebElement element2 = driver
				.findElement(By.xpath("//select[contains(@class,'form-control cat_item_option ')]"));
		element2.sendKeys("Unlimited");

		// selecting the colour
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();

		// selecting the storage 512
		driver.findElement(By.xpath("//label[text()='512 GB [add £224.34]']")).click();

		// add to basket
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();

		// verify and get the referance number
		String title  = driver.getTitle();
		System.out.println("verifing the order ; " + title);
		WebElement element3 = shadow.findElementByXPath("//div[@id='sc_order_status_intro_text']/dl/dd[2]");
		String refnum = element3.getText();
		System.out.println("order Rferance number : " + refnum);

		// Take a screenshot
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("/Users/rthanaraj/Downloads/Screenshot/Amazon/sc/servicedev.jpg");
		FileUtils.copyFile(screenshotAs, file);
		
		// closing the drive
		driver.close();
	}

}
