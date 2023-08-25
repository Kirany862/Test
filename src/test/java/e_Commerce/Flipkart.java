package e_Commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
	@Test
	public void flipkartTest() {
		Reporter.log("Opening Flipkart", true);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}
}
