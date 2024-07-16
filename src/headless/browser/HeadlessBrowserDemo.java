package headless.browser;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class HeadlessBrowserDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);

		WebElement selectMobile = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		selectMobile.click();

		Set<String> parentChildId = driver.getWindowHandles();

		Assert.assertEquals(parentChildId.size(), 2, "test case failed");
		System.out.println("END");
	}
}