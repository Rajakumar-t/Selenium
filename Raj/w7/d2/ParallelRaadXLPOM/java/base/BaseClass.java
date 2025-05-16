package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class BaseClass {

	// Declare the WebDriver (using Firefox here, but should ideally use WebDriver
	// for flexibility)
	public FirefoxDriver driver;

	// Declare a variable to hold the Excel filename used by the DataProvider
	public String filename;

	// This method runs before each @Test method
	@BeforeMethod
	public void preConditions() {
		// Launch a new Firefox browser session
		driver = new FirefoxDriver();

		// Navigate to the application login page
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set an implicit wait of 30 seconds to handle element load time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	// This method runs after each @Test method to close the browser
	@AfterMethod
	public void postConditions() {
		driver.close(); // Close the browser session
	}

	// DataProvider method to supply data to @Test methods
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		// Calls the ReadExcel utility to read data from the Excel file set in the
		// 'filename' variable
		String[][] readData = ReadExcel.readData(filename);
		return readData; // Returns the test data as a 2D String array
	}
}