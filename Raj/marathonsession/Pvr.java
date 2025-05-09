package marathonsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pvr {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get (" https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1-cell-1']")).click();
		WebElement get = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']/div/div/div/h2/span[1]"));
		String text = get.getText();
		System.out.println(text);
		driver.findElement(By.xpath("//li[@id='p_123/418063']/span/a/span")).click();
		WebElement get1 = driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']"));
		get1.click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
	}

}
