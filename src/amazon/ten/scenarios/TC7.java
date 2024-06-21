//7. launch home page->dropdown->amazon fresh->search for mango	
package amazon.ten.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC7 extends LaunchAndQuit{

	@Test
	@Parameters("browser")
	public void searchMango() {
		
		WebElement allDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select selectAmazonFresh = new Select(allDropdown);
		selectAmazonFresh.selectByValue("search-alias=nowstore");
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mango");
		searchItem.sendKeys(Keys.ENTER);
	}
}
