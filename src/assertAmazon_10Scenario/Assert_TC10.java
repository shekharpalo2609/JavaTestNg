//10. search shoe->go back go home page	-> Assert it
package assertAmazon_10Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_TC10 extends LaunchAndQuit {

	@Test
	public void assertSearchShoe() throws InterruptedException {

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("shoe");
		searchBox.sendKeys(Keys.ENTER);
		
		driver.navigate().back();
		
		Thread.sleep(500);
		//Assert.assertEquals(searchBox.isDisplayed(), true, "Test Case 10 failed!");
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Test Case 10 failed!");
	}
}
