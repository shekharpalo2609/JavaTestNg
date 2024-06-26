//3. search mouse -> sort Get It in 2 Days->click on 1st product	
package amazon.parallel.ten.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TC3 extends LaunchAndQuit{

	@Test
	@Parameters("browser")
	public void searchMouse() {
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mouse");
		searchItem.sendKeys(Keys.ENTER);

		WebElement getIn2Days = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]"));
		getIn2Days.click();
		
		WebElement selectMouse = driver.findElement(By.partialLinkText("Dell MS116 Wired Optical Mouse"));
		selectMouse.click();
	}
	
}
