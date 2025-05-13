package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002LoginFunction extends BaseClass {
	@BeforeTest 
	public void setData () {
		filename = "Login";
	}
		
	@Test(dataProvider="fetchData")
	
	public void runLogin(String uname, String pword) {
		LoginPage lp=new LoginPage();
		lp.enterUsername(uname)
		.enterPassword(pword)
		.clickLoginButton();

	}

}
