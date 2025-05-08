package hw.w4.d2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingTestLeaf {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(option);
		// driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		// clicking Contact

		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		// click on Merge Contact
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//div[@class='subSectionBlock']/form/table/tbody/tr/td[2]/a")).click();

		// switching the window using handles
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> all = new ArrayList<String>(windowHandles);
		driver.switchTo().window(all.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

		// switching back to window 0
		driver.switchTo().window(all.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='subSectionBlock']/form/table/tbody/tr[2]/td[2]/a")).click();
		// handleing the second window by creating set and list

		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> all1 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(all1.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

		// toggling back to window 0
		driver.switchTo().window(all.get(0));
		Thread.sleep(1000);

		// clicking merge Button
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();

		// Acepting the pop-up
		driver.switchTo().alert().accept();
		// veriging the title page.

		String Ti = driver.getTitle();
		System.out.println(Ti);
	}
}
