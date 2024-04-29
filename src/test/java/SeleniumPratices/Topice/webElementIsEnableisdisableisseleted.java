package SeleniumPratices.Topice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webElementIsEnableisdisableisseleted {
	
	@Test
	public void EnableDisableSelected() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.linkText("Register")).click();
		WebElement  searchbutton = driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		//Search button is enabled or not 
		System.out.println("Displayed status" + searchbutton.isDisplayed());
		//search button is disabled or not
		System.out.println("Enable Status" + searchbutton.isEnabled());
		//search button is selected or not
		System.out.println("Selected Status" +searchbutton.isSelected());
		
		// Isselected is check box and ratio button button are selected
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id ='gender-male']"));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id ='gender-female']"));
		System.out.println("Check the selected status of radio buttonv:" + "Female radio button - "+ maleRadioButton.isSelected() + "Male radio button - " + maleRadioButton.isSelected());
		maleRadioButton.click();
		System.out.println("Check the selected status of radio buttonv:" + "Female radio button - "+ maleRadioButton.isSelected() + "Male radio button - " + maleRadioButton.isSelected());
		driver.close();
		
	}

}
