//8. launch home page-> dropdown ->search for "power of mind"->click on the 1st product -> Assert it
package assertAmazon_10Scenario;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_TC08 extends LaunchAndQuit {

	@Test
	public void assertSearchBook() {
		
		WebElement allDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select selectBooks = new Select(allDropdown);
		selectBooks.selectByValue("search-alias=stripbooks");
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("power of mind");
		searchItem.sendKeys(Keys.ENTER);
		
		WebElement selectBook = driver.findElement(By.partialLinkText("The Power of Your Subconscious Mind"));
		selectBook.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> parentChildId = windowHandles.iterator();
		
		String parentId = parentChildId.next();
		String childId = parentChildId.next();
		
		driver.switchTo().window(childId);
		
		WebElement addToWishlist = driver.findElement(By.xpath("//a[normalize-space()='Add to Wish List']"));
		
		Assert.assertEquals(addToWishlist.isDisplayed(), true, "Test case 8 failed!");
	}
}
