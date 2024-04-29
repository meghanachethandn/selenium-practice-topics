package SeleniumPratices.Topice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaiceUrlBrowser {

	@Test
	public void geturl() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		// Title of the page
		String TitleOfPage = driver.getTitle();
		System.out.println(TitleOfPage);
		//URL of the page
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		// Source code of the page
		String pagesourcecode = driver.getPageSource();
		System.out.println(pagesourcecode);

}


}
