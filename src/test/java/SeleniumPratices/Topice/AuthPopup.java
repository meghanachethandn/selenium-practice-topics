package SeleniumPratices.Topice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopup {
	@Test
	public void popup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		// Syntax
		// http://admin:admin@the-internet.herokuapp.com/basic_auth
		//http://admin:admin@URL
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
