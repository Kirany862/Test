package e_Commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
	
		@Test
		public void amazonTest() {
			Reporter.log("Opening Amazon", true);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.quit();
		}
	}

