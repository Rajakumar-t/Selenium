package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadTestLeaf extends BaseClass{

	
	
	@When("I click on Find Leads")
	public EditLeadTestLeaf i_click_on_find_leads() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}

	@When("I click on the Phone tab")
	public EditLeadTestLeaf i_click_on_the_phone_tab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}

	@When("I enter phone number {string}")
	public EditLeadTestLeaf i_enter_phone_number(String string) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
	}

	@When("I click on the Find Leads button")
	public EditLeadTestLeaf i_click_on_the_find_leads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}

	@When("I select the first resulting lead")
	public EditLeadTestLeaf i_select_the_first_resulting_lead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}

	@When("I click on Edit lead")
	public EditLeadTestLeaf i_click_on_edit_lead() {
		driver.findElement(By.linkText("Edit")).click();
		return this;
	}

	@When("I update the company name to {string}")
	public EditLeadTestLeaf i_update_the_company_name_to(String string) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	}

	@When("I click on the Update button")
	public EditLeadTestLeaf i_click_on_the_update_button() {
		driver.findElement(By.name("submitButton")).click();
		return this;
	}

	@Then("The lead's company name should be updated successfully")
	public void the_lead_s_company_name_should_be_updated_successfully() {
	   String title = driver.getTitle();
	    System.out.println(title);
	}
}
