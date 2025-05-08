package hw.w4.d2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//launch browser
		driver.get("https://www.ajio.com");
		//maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//closing the pop-up
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		//WebElement element = driver.findElement(By.xpath("//iframe[@title='Sign in with Google Dialogue']"));
		//driver.switchTo().frame(element);
		//driver.findElement(By.xpath("//div[@id='close']")).click();
		//input in search bar & click
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bag");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
	}
}
