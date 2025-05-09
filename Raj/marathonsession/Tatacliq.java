package marathonsession;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		FirefoxDriver driver = new FirefoxDriver();
		// Getting the URL as requested & maximising the browser
		driver.get("https://www.tatacliq.com");
		driver.manage().window().maximize();

		// accept the cookie

		driver.findElement(By.xpath("//div[@class='wzrk-button-container']/button[1]")).click();

		// MoverHover the watch & accessories
		Actions hover = new Actions(driver);
		Thread.sleep(3000);
		WebElement brand = driver.findElement(By.xpath("//div[@class=\"DesktopHeader__categoryAndBrand\"][2]"));
		hover.moveToElement(brand).click().perform();

		// clicking the watches
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[5]"))
				.click();

		// selecting the Casio
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Casio']")).click();

		// using select class to select newest fist
		Thread.sleep(5000);
		WebElement selectnew = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select first = new Select(selectnew);
		first.selectByVisibleText("New Arrivals");

		// get the price for all watch
		Thread.sleep(5000);
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductModule__content']//h3"));
		System.out.println("Prices of all watches on the page:");
		for (int i = 0; i < prices.size(); i++) {
			WebElement p = prices.get(i);
			System.out.println(p.getText());
		}

		// click on the first resulting watch
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();

		// Handling Alert Pop Up
		// no pop-up

		// compare two price are similar
		Set<String> window = driver.getWindowHandles();
		List<String> allAddress = new ArrayList<String>(window);
		driver.switchTo().window(allAddress.get(1));

		// compare two price are similar
		// div[@class='ProductModule__content']/div/div[2]/div/h3
		Thread.sleep(5000);
		WebElement childprice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3"));
		String cp1 = childprice.getText();
		System.out.println(cp1);

		// switching to the parent window
		driver.switchTo().window(allAddress.get(0));
		WebElement p = prices.get(1);
		String pp = p.getText();
		System.out.println(pp);

		if (cp1.equals(pp)) {
			System.out.println("Price Verified");
		} else {
			System.out.println("Price not verifed");
		}

		// adding to the cart
		driver.switchTo().window(allAddress.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='1']")).click();

		// Take a screenShot
		Thread.sleep(5000);
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("/Users/rthanaraj/Downloads/Screenshot/tatacliq/sc/tatawatch.jpg");
		FileUtils.copyFile(scr, target);

		// close child window and next parent window
		driver.close();
		driver.switchTo().window(allAddress.get(0));
		driver.close();
	}

}
