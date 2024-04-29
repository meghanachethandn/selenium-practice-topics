package SeleniumPratices.Topice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageNavigation {
	@Test
	public void navigation() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	// ***	driver.navigate().to("https://demo.nopcommerce.com/")
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(5);
		//Backward navigation
		driver.navigate().back();
		Thread.sleep(5);
		//Forward navigation
		driver.navigate().forward();
		Thread.sleep(5);
		// Refresh the page
		driver.navigate().refresh();
		Thread.sleep(5);
		driver.close();
	}

}
