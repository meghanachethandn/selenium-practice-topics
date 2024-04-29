package SeleniumPratices.Topice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	@Test
	public void fileupload(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		// Using Send key word - Only when in html code if Type= file we can use sendkeys
		//WebElement button = driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]"));
		//button.click();
		//driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("F:\\Meghana_CV_QA.docx");
		// Using Robot class methods
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]"));
		
		
		
		
	}
	


}
