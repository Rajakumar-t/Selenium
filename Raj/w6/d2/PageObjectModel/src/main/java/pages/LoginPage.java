package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage enterUsername(String uname) {
		
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	
  public LoginPage enterPassword(String pword) {
	  driver.findElement(By.id("password")).sendKeys(pword);
      return this;
	}

  public WelcomePage clickLoginButton() {
	  driver.findElement(By.className("decorativeSubmit")).click();
       WelcomePage wp=new WelcomePage();
       return wp;
}

}
