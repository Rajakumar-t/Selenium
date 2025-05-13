package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceCreatAccountStepDefination {
	public EdgeDriver driver;

	@Given("Launch the salesforce page")
	public void launch_the_salesforce_page() {
		driver = new EdgeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
	}

	@Given("enter with username {string}")
	public void enter_with_username(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter the password {string}")
	public void enter_the_password(String pw) {
		driver.findElement(By.id("password")).sendKeys(pw);
	}

	@When("I Click on toggle menu button from the left corner")
	public void i_click_on_toggle_menu_button_from_the_left_corner() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@When("I Click view All and click Sales from App Launcher")
	public void i_click_view_all_and_click_sales_from_app_launcher() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
		Thread.sleep(3000);
		WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();", accountsTab);
	}

	@When("I click on New button")
	public void i_click_on_new_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
	}

	@When("I enter {string} as the account name")
	public void i_enter_as_the_account_name(String name) throws InterruptedException {
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@name='Name']"));
		element.click();
		element.sendKeys(name);
	}

	@When("I select Ownership as Public")
	public void i_select_ownership_as_public() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[3]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@Then("I click save and verify Account name is {string}")
	public void i_click_save_and_verify_account_name_is(String expectedName) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(3000);
		String actualName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		if (expectedName.equals(actualName)) {
			System.out.println("Verified");
		}

		driver.quit();
	}

}
