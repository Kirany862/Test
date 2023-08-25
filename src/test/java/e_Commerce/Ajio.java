package e_Commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
	@Test
	public void ajioTest() {
		Reporter.log("Opening Ajio", true);
		
		/*ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");*/
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.quit();
	}
}

