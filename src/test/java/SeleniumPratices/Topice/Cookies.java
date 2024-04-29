package SeleniumPratices.Topice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {
	@Test
	public void cookeis() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		// How to capture cookies
		Set<Cookie> cookies =driver.manage().getCookies();
		System.out.println("Number of cookies :" + cookies.size() );
		// Print all cookies
		for(Cookie cookie : cookies) {
			System.out.println("List of cookies : " +cookie );	
		}
		//Adding cookies to the browser
		Cookie cookieobj = new Cookie("My cookie123", "12235");
		driver.manage().addCookie(cookieobj);
		cookies = driver.manage().getCookies();
		System.out.println("List of cookies after adding new one" +cookies.size() );
		
		// Deleting cookie
		driver.manage().deleteCookieNamed("My cookie123");
		cookies = driver.manage().getCookies();
		System.out.println("Cookie list after deleting" +cookies.size() );
		// Delet all cookies
		
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("After deleting of all cookies : " + cookies.size());
	}

}
