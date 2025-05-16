package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001CreateLeadFunctionality extends BaseClass {
	@BeforeTest
	public void setData() {
		// Sets the Excel file name (without .xlsx extension) that will be used by the
		// DataProvider
		filename = "CreateLead2"; // Excel file must be located in ./Data/CreateLead2.xlsx
	}

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String uname, String pword, String cname, String fname, String lname) {

		// Step 1: Login to the application using username and password
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(uname) // Enter the username from Excel
				.enterPassword(pword) // Enter the password from Excel
				.clickLoginButton() // Click the login button

				// Step 2: Navigate through CRM/SFA > Leads > Create Lead
				.clickCRMSFALink() // Click on the CRM/SFA link after login
				.clickLeadsLink() // Click on the "Leads" tab
				.clickCreateLeadLink() // Click on the "Create Lead" option

				// Step 3: Fill out the Create Lead form using data from Excel
				.enterCompanyName(cname) // Enter company name
				.enterFirstName(fname) // FIXED: Changed from enterLastName(fname) to enterFirstName(fname)
				.enterLastName(lname) // Enter last name

				// Step 4: Submit the form and verify the result
				.clickCreateLeadButton() // Click the submit button to create the lead
				.verifyLead(); // Verify that the lead was created successfully
	}
}
//@Test  @BeforeMethod  @AfterMethod
