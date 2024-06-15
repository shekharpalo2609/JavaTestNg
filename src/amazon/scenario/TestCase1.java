//login->searching->click on 1st product->logout	
package amazon.scenario;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1  extends LoginLogout{

	@Test
	void search() throws EncryptedDocumentException, IOException {
		
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

		System.out.println("Test case1");
	}
}
