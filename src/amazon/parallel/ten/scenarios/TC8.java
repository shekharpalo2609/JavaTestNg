//8. launch home page-> dropdown ->search for "power of mind"->click on the 1st product	
package amazon.parallel.ten.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC8 extends LaunchAndQuit{

	@Test
	@Parameters("browser")
	public void searchBook() {
		
		WebElement allDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select selectBooks = new Select(allDropdown);
		selectBooks.selectByValue("search-alias=stripbooks");
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("power of mind");
		searchItem.sendKeys(Keys.ENTER);
		
		WebElement selectBook = driver.findElement(By.partialLinkText("The Power of Your Subconscious Mind"));
		selectBook.click();
	}
}
