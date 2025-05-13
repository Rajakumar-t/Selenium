package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class WelcomePage extends BaseClass {
	
   public MyHomePage clickCRMSFALink() {
	   driver.findElement(By.linkText("CRM/SFA")).click();
       return new MyHomePage();
	}
   
   public LoginPage logout() {
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
    return new LoginPage();
}

}
