package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001CreateLeadFunctionality extends BaseClass {
	@BeforeTest
	public void setData () {
		filename = "Login";
	}
	@Test (dataProvider="fetchData")
	public void runCreateLead(String uname, String pword) {
		LoginPage lp = new LoginPage();
		lp.enterUsername(uname)
		.enterPassword(pword)
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickCreateLeadLink().
		enterCompanyName()
		.enterLastName()
		.clickCreateLeadButton()
		.verifyLead();

	}

}

//@Test  @BeforeMethod  @AfterMethod
