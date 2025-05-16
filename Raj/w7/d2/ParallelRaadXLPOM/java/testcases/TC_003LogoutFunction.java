package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_003LogoutFunction extends BaseClass {
	
	// This method runs once before any @Test methods in the class
	@BeforeTest
	private void setData() {
		// Sets the Excel file name (without extension) that the DataProvider will read
		// This file should be placed in the /Data/ folder and contain username/password
		// columns
		filename = "login";
	}

	@Test(dataProvider = "fetchData")
	public void runLogout(String uname, String pword) {
	    // Create an instance of the LoginPage and perform the login-logout flow using Excel data
	    LoginPage lp = new LoginPage(driver);

	    lp.enterUsername(uname)       // Enter the username from Excel data
	      .enterPassword(pword)       // Enter the password from Excel data
	      .clickLoginButton()         // Click the login button to sign in
	      .logout();                  // After login, immediately perform logout and return to LoginPage
	}
}