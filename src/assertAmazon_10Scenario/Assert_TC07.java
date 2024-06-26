//7. launch home page->dropdown->amazon fresh->search for mango -> Assert it
package assertAmazon_10Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_TC07 extends LaunchAndQuit {

	@Test
	public void assertSearchMango() {
		
		WebElement allDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select selectAmazonFresh = new Select(allDropdown);
		selectAmazonFresh.selectByValue("search-alias=nowstore");
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mango");
		searchItem.sendKeys(Keys.ENTER);
		
		Assert.assertEquals(driver.getTitle(), "Amazon.in : mango", "Test Case 7 failed!");
	}
}
