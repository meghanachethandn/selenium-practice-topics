package SeleniumPratices.Topice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {
	@Test
	public void dynamictable() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pizgloria.americantower.com/PizGloria_UAT_UI/#/login");
		driver.findElement(By.xpath("//*[@id=\"logincard\"]/div/form/div[1]/input")).sendKeys("umesh");
		driver.findElement(By.xpath("//*[@id=\"logincard\"]/div/form/div[2]/input")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(10);
		String countofPages = driver.findElement(By.xpath("//*[@id=\"ag-49-row-count\"]")).getText();
		System.out.println("Number of page count in the table :" + countofPages);
	}

}
