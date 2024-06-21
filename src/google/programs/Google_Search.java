package google.programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Google_Search 
{
	WebDriver driver;
		@Test
		public void testcase1()
		{
			
			if(1==1)
			{
		 driver = new ChromeDriver();//will launch chrome 
			}
			if(1==2)
			{
		 driver = new FirefoxDriver();//will launch firefox
			}
			if(1==3)
			{
		 driver = new EdgeDriver();//will launch edge
			}
			driver.get("https://www.google.com/");
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleContains("Goo"));

		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("India");
		searchBox.sendKeys(Keys.ENTER);

	}
	
	
}
