package hooks;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import steps.BaseClass;

public class HooksImplementation extends BaseClass{

	
	@Before
	public void preConditions() {
		driver=new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	@After
   public void postConditions() {
		driver.close();
	}
}
