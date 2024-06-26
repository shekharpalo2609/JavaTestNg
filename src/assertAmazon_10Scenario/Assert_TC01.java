//1. Search shoe->click on 1st shoe -> Assert whether a particular shoe is selected
package assertAmazon_10Scenario;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_TC01 extends LaunchAndQuit {

	@Test
	public void assertSelectShoe() {

		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("shoe");
		searchBox.sendKeys(Keys.ENTER);

		WebElement selectShoe = driver.findElement(By.xpath("(//div[@class = 's-image-padding'])[1]"));
		selectShoe.click();
		
		Set<String > parentChildId = driver.getWindowHandles();
		Assert.assertEquals(parentChildId.size(), 2, "Test case 1 failed");
	}
}
