package SeleniumPratices.Topice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementandElements {
	@Test
	public void FindElements() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement  searchbutton = driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		searchbutton.sendKeys("abc");
		
		List<WebElement>  HeaderSection = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of webelement capture : " + HeaderSection.size());
		for (WebElement elem : HeaderSection ) {
			System.out.println(elem.getText());
		}
		//System.out.println(HeaderSection);

		driver.close();
	}

}
