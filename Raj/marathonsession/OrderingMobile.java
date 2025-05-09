package marathonsession;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrderingMobile {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		// Getting the URL as requested & maximising the browser
		driver.get("https://dev186929.service-now.com/");
		driver.manage().window().maximize();
		
		//Login with valid credentials username as admin and password 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		
		//Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		
	}

}
