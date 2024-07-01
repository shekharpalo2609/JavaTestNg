package amazon.retryDemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestAmazon {

	@Test(retryAnalyzer = amazon.retryDemo.RetryAmazonLogic.class)
	public void launchAmazon() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("shoe");
		searchBox.sendKeys(Keys.ENTER);

		WebElement selectShoe = driver.findElement(By.xpath("(//div[@class = 's-image-padding'])[1]"));
		selectShoe.click();

		Set<String> parentChildId = driver.getWindowHandles();
		Assert.assertEquals(parentChildId.size(), 6, "Test case 1 failed");

	}
}
