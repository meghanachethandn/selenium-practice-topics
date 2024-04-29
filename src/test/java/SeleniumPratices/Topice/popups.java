package SeleniumPratices.Topice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popups {
	@Test
	public void popup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		// switching alert pop up  window with ok button
		driver.switchTo().alert().accept();
		// Switchin alert pop up window with ok and cancel button
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		// close the pop up by ok button 
		driver.switchTo().alert().accept();
		// closing the pop up by cancel button
		driver.switchTo().alert().dismiss();
		
		// Alert window with input box, capture text from alert
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alertpopup = driver.switchTo().alert();
		System.out.println(alertpopup.getText());
		
		alertpopup.sendKeys("Welcome");
		driver.switchTo().alert().dismiss();

	}

}
