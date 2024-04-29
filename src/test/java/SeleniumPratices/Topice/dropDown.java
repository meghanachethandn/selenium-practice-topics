package SeleniumPratices.Topice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {
	@Test
	public void dropdownelements() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//ul[@class =\"top-menu notmobile\"]//li[7]/a")).click();
		WebElement orderList = driver.findElement(By.xpath("//select[@id =\"products-orderby\"]"));
		Select prodList = new Select(orderList);
		//prodList.selectByVisibleText("Name: A to Z");
		//prodList.selectByValue("15");
		//prodList.selectByIndex(3);
	
		// selecting option from drop down with out using select methods
		List<WebElement> alloptions = prodList.getOptions();
		for(WebElement options:alloptions) {
			if(options.getText().equals("Name: Z to A")) {
				options.click();
				break;
			}
		}
		// need to print all option in select tab (drop down)
		for(WebElement option : alloptions) {
			System.out.println("option present in th drop down : " + option.getText());
		}
	}

}
