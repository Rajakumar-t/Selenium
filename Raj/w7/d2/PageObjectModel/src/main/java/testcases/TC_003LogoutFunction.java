package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_003LogoutFunction extends BaseClass {
	
	@BeforeTest 
	private void setData() {
		filename = "login";

	}
	
	@Test(dataProvider = "fetchData")
	public void runLogout(String uname, String pword) {
		LoginPage lp=new LoginPage();
		lp.enterUsername(uname)
		.enterPassword(pword)
		.clickLoginButton()
		.logout();

	}

}
