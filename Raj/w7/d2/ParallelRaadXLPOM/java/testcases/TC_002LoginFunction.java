package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002LoginFunction extends BaseClass {
	@BeforeTest
	public void setData() {
		// Set the name of the Excel file (without extension) to be used for this test's
		// data
		// This tells the DataProvider to read from ./Data/Login.xlsx
		filename = "Login";
	}

	@Test(dataProvider = "fetchData")
	public void runLogin(String uname, String pword) {
		// Create an instance of the LoginPage and pass the WebDriver
		LoginPage lp = new LoginPage(driver);

		// Perform login steps using data from the Excel file:
		lp.enterUsername(uname) // Enters the username from Excel
				.enterPassword(pword) // Enters the password from Excel
				.clickLoginButton(); // Clicks the login button to submit the form
	}
}
