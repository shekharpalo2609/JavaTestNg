//9.Launch home page->click on todays deals->deals of the day->click on the 1st product -> Assert it
package assertAmazon_10Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_TC09 extends LaunchAndQuit {
	
	@Test
	public void assertDeals() throws InterruptedException {
		
		WebElement todaysDealMajorTab = driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']"));
		todaysDealMajorTab.click();
		
		WebElement dealOfTheDay = driver.findElement(By.xpath("//button[normalize-space()='Deal of the Day']"));
		dealOfTheDay.click();
		
		Thread.sleep(500);
		WebElement selectProduct = driver.findElement(By.xpath("//div[@aria-label=\"Redmi Note 13 Pro+ (Fusion Purple, 12GB RAM, 512GB Storage) | World's First Mediatek 7200 Ultra 5G | 200MP Hi-Res Camera | 1.5K Curved AMOLED | 120W HyperCharge\"]//span[2]"));
		selectProduct.click();
		
		WebElement buyNow = driver.findElement(By.xpath("//span[@id='submit.buy-now']"));
		
		Assert.assertEquals(buyNow.isDisplayed(), true, "Test case 9 failed!");
	}
}
