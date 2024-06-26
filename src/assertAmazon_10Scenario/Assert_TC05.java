//5. search camera->click on camera -> Assert the result
package assertAmazon_10Scenario;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_TC05 extends LaunchAndQuit {

	
	@Test
	public void assertSelectCamera() {
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("camera");
		searchItem.sendKeys(Keys.ENTER);
		
		/*
		 * WebElement nextPage =
		 * driver.findElement(By.cssSelector("[aria-label='Go to page 3']"));
		 * nextPage.click();
		 */
		WebElement select35thCamera = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[5]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]"));
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.titleContains("Camera"));
		 */
		select35thCamera.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> parentChildId = windowHandles.iterator();
		
		String parentId = parentChildId.next();
		String childId = parentChildId.next();
		
		driver.switchTo().window(childId);
		
		WebElement buyNow = driver.findElement(By.cssSelector("#buy-now-button"));
		
		Assert.assertEquals(buyNow.isDisplayed(), true,"Test case 5 failed");
	}
}
