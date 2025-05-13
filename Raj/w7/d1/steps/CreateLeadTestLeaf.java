package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateLeadTestLeaf extends BaseClass {

	@When("I enter the username as {string}")
	public CreateLeadTestLeaf i_enter_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username); 
		return this;
	}

	@When("I enter the password as {string}")
	public CreateLeadTestLeaf i_enter_the_password_as(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword); 
		return this;
	}

	@When("I click on the Login button")
	public CreateLeadTestLeaf i_click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}

	@When("I click on CRM\\/SFA link")
	public CreateLeadTestLeaf i_click_on_crm_sfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return this;
	}
	@When("I click on Leads tab")
	public CreateLeadTestLeaf i_click_on_leads_tab() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		return this;

	}

	@When("I click on Create Lead option")
	public CreateLeadTestLeaf i_click_on_create_lead_option() {
		driver.findElement(By.partialLinkText("Create Lead")).click();
		return this;
	}

	@When("I enter company name {string}")
	public CreateLeadTestLeaf i_enter_company_name(String string) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}

	@When("I enter first name {string}")
	public CreateLeadTestLeaf i_enter_first_name(String string) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		return this;

	}

	@When("I enter last name {string}")
	public CreateLeadTestLeaf i_enter_last_name(String string) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		return this;
	}

	@When("I click on the Create Lead button")
	public CreateLeadTestLeaf i_click_on_the_create_lead_button() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		return this;
	}

	@Then("The lead should be created and View Lead page should be displayed")
	public void the_lead_should_be_created_and_view_lead_page_should_be_displayed() {
		String title = driver.getTitle();
		System.out.println(title);
	}
}
