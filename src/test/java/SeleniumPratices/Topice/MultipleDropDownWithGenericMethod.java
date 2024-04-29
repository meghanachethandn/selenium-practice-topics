package SeleniumPratices.Topice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDownWithGenericMethod {
	
	@Test
	public void Multipledropdownelements() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//ul[@class =\"top-menu notmobile\"]//li[7]/a")).click();
		WebElement orderList = driver.findElement(By.xpath("//select[@id =\"products-orderby\"]"));
		selectoptionfromdropdown(orderList,"Name: A to Z");
		WebElement pagecount = driver.findElement(By.xpath("//select[@id =\"products-pagesize\"]"));
		selectoptionfromdropdown(pagecount,"9");
	}
	public static void selectoptionfromdropdown(WebElement element,String value ) {
		Select drp = new Select(element);
		List<WebElement> alloptions = drp.getOptions();
		for(WebElement option : alloptions) {
			if(option.getText().equals(value)) {
				option.click();
			}
		}
	}
}
