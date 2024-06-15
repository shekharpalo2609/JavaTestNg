//login->searching->click on 1st product->add it to wishlist->add it to cart->logout	
package amazon.scenario;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends LoginLogout{

	@Test
	void searchToCart() {
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mobile");
		searchItem.sendKeys(Keys.ENTER);

		WebElement selectItem = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		selectItem.click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		Iterator<String> parentChildId = windowHandle.iterator();
		String parentId = parentChildId.next();
		String childId = parentChildId.next();
		driver.switchTo().window(childId);

		WebElement wishList = driver.findElement(By.id("add-to-wishlist-button-submit"));
		wishList.click();

		WebElement viewWishList = driver.findElement(By.linkText("View Your List"));
		viewWishList.click();

		WebElement addToCart = driver.findElement(By.xpath("//a[@class='a-button-text a-text-center']"));
		addToCart.click();
		System.out.println("Test Case2");
	}
	
}
