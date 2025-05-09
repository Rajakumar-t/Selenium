package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	public FirefoxDriver driver;

	@Given("Launch the browser")
	public void launch_the_browser() {
		driver = new FirefoxDriver();

	}

	@And("Load the Url")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@And("Enter the username as {string}")
	public void enter_the_username_as(String string) {
		driver.findElement(By.id("username")).sendKeys("username");
	}

	@And("Enter the password as {string}")
	public void enter_the_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys("password");
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should navigate to the next page")
	public void it_should_navigate_to_the_next_page() {
		System.out.println("It navigate to the next page");
	}

}
