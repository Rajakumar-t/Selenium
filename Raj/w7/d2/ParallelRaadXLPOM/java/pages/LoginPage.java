package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage (FirefoxDriver driver) {
		this.driver = driver;
	}

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
		WelcomePage wp = new WelcomePage(driver);
		return wp;
	}

}
