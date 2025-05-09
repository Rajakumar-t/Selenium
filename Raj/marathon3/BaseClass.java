package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public FirefoxDriver driver;
	WebDriverWait wait;
	
	@Parameters ({"url","username","password"})

	@BeforeMethod
	public void precondition(String url, String username, String password) throws InterruptedException {
		FirefoxOptions ff = new FirefoxOptions();
		ff.addArguments("--disable-notifications");
		driver = new FirefoxDriver(ff);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		
		// Click on toggle menu button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			

	}

	@AfterMethod
	public void postCondition() {
		//driver.close();

	}
}
