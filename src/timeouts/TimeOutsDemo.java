package timeouts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOutsDemo {

	@Test(timeOut = 10000)
	public void launchAmazon() {
	ChromeDriver	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchBox.sendKeys("shoe");
	searchBox.sendKeys(Keys.ENTER);

	WebElement selectShoe = driver.findElement(By.xpath("(//div[@class = 's-image-padding'])[1]"));
	selectShoe.click();
	driver.close();
	
	}
}
