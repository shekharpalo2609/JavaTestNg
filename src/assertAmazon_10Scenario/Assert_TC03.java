//3. search mouse -> sort Get It in 2 Days->click on 1st product -> Assert whether the results are getting after filtration
package assertAmazon_10Scenario;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_TC03 extends LaunchAndQuit {

	@Test
	public void assertSearchMouse() {

		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mouse");
		searchItem.sendKeys(Keys.ENTER);

		WebElement getIn2Days = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]"));
		getIn2Days.click();

		WebElement selectMouse = driver.findElement(By.partialLinkText("Dell MS116 Wired Optical Mouse"));
		selectMouse.click();

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> parentChildId = windowHandles.iterator();

		String parentId = parentChildId.next();
		String childId = parentChildId.next();

		driver.switchTo().window(childId);

		WebElement addToCart = driver.findElement(By.xpath("(//input[@id= 'add-to-cart-button'])[1]"));

		Assert.assertEquals(addToCart.isDisplayed(), true, "Test case 3 failed!");
	}
}
