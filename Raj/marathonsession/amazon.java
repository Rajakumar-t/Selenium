package marathonsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        // 03) Type "Bags for boys" in the Search box
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");

        // 04) Choose the item in the result (auto-suggestion click)
        Thread.sleep(1000); // let the suggestion box load
        driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1-cell-1']")).click();

        // 05) Print the total number of results
        WebElement resultText = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
        System.out.println(resultText.getText());


        // 06) Select the first 2 brands in the left menu
        driver.findElement(By.xpath("//li[@id='p_123/418063']/span/a/span")).click();
        Thread.sleep(2000); // small wait after filter
        //driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
        //Thread.sleep(2000);

        // 07) Choose New Arrivals (Sort)
        driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
        driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
        Thread.sleep(2000); 

        // 08) Print first resulting bag info (name, discounted price)
        WebElement firstBagName = driver.findElement(By.xpath("//span[text()='Charm 03 School Backpack']"));
        WebElement firstBagPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));

        System.out.println("First Bag Name: " + firstBagName.getText());
        System.out.println("Discounted Price: ₹" + firstBagPrice.getText());

        // 09) Get the page title and close the browser
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(3000);
        driver.close();

	}

}
