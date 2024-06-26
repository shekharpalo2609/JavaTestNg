//Assertion demo whether new page is opened once the product is clicked on the home page in amazon.in

package amazonAssert;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonPagesAssert {

	WebDriver driver;

	@Test
	public void testPages() {

		driver = new ChromeDriver();
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

	}
}
