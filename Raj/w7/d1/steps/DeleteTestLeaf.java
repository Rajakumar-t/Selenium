package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteTestLeaf extends BaseClass{

	@When("I login with username {string}")
	public DeleteTestLeaf i_login_with_username(String username) {
		driver.findElement(By.id("username")).sendKeys(username); 
		return this;
	}
	@When("password {string}")
	public DeleteTestLeaf password(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword); 
		return this;
	}
	@When("I click the login submit button")
	public DeleteTestLeaf i_click_the_login_submit_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
	@When("I navigate to crm")
	public DeleteTestLeaf i_navigate_to_crm() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return this;
	}


	@When("I click on lead button")
	public DeleteTestLeaf i_click_on_lead_button() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		return this;

	}

	@When("I click on FindLead lead")
	public DeleteTestLeaf i_click_on_find_lead_lead() {
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[1]")).click();
		return this;
	}

	@When("I click on the Name and ID tab")
	public DeleteTestLeaf i_click_on_the_name_and_id_tab() {
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[1]")).click();
		return this;
	}

	@When("I enter in the first name field {string}")
	public DeleteTestLeaf i_enter_in_the_first_name_field(String fname) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fname);
		return this;
	}

	@When("I click on Find Leads button")
	public DeleteTestLeaf i_click_on_find_leads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}

	@Then("I should see the first lead in the result list")
	public DeleteTestLeaf i_should_see_the_first_lead_in_the_result_list() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement leadElement = driver.findElement(By.xpath("(//a[text()='Saranya'])[1]"));
		String leadName = leadElement.getText();
		System.out.println("First Lead name: "+leadName);
		return this;
	}

	@When("I click on the first lead named {string}")
	public DeleteTestLeaf i_click_on_the_first_lead_named(String string) {
		WebElement leadElement = driver.findElement(By.xpath("(//a[text()='Saranya'])[1]"));
		leadElement.click();
		return this;
	}

	@When("I click the Delete button")
	public DeleteTestLeaf i_click_the_delete_button() {
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		return this;
	}
	    

	@Then("the lead should be deleted successfully")
	public void the_lead_should_be_deleted_successfully() {
		String titel= driver.getTitle();
	    System.out.println(titel);
	}

}
