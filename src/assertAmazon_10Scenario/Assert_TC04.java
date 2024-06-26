//4. search mobile cover->Include Out of Stock check box -> Assert whether the filtration is correct.	

package assertAmazon_10Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_TC04 extends LaunchAndQuit {

	@Test
	public void assertSearchMobileCover() throws InterruptedException{
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mobile cover");
		
		WebElement search = driver.findElement(By.cssSelector("[type='submit']"));
		search.click();
		
		//WebElement selectOutOfStock = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[127]"));
		//WebElement selectOutOfStock = driver.findElement(By.xpath("(//input[@type='checkbox'])[124]"));
		//WebElement selectOutOfStock = driver.findElement(By.xpath("(//span[@class = 'a-size-base a-color-base'])[141]"));
		WebElement selectOutOfStock = driver.findElement(By.xpath("//span[contains(text(),'Include Out of Stock')]"));
		selectOutOfStock.click();
		Thread.sleep(1000);
		
		//Assert.assertEquals(selectOutOfStock.isSelected(), true,"Test case 4 failed");
		Assert.assertEquals(driver.getTitle(), "Amazon.in: Mobile Cover - Include Out Of Stock","Test case 4 failed");
	}
}
