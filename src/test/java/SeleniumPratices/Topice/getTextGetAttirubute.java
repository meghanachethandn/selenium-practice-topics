package SeleniumPratices.Topice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextGetAttirubute {
	
	@Test
	public void getTextClear() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		email.clear();
		email.sendKeys("meghana.dn@invendis.com");
		password.clear();
		password.sendKeys("12345678");
		
		//capturing values of inputs we are using getAttribute() and getText()
		// eg : <input name="asd" id=23 value = "1234">abdcerr </input>
		// name,id,value is for getattribute() and abdcerr is of gettext()
		System.out.println("Values of email" + email.getAttribute("value"));
		
	}

}
