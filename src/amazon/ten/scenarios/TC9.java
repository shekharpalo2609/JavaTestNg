//9.Launch home page->click on todays deals->deals of the day->click on the 1st product 	
package amazon.ten.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC9 extends LaunchAndQuit{

	@Test
	@Parameters("browser")
	public void deals() {
		
		WebElement todaysDealMajorTab = driver.findElement(By.xpath("(//a[@tabindex='0'])[9]"));
		todaysDealMajorTab.click();
		
		WebElement dealOfTheDay = driver.findElement(By.xpath("(//button[@data-csa-c-element-type='option'])[1]"));
		dealOfTheDay.click();
		
		WebElement selectProduct = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]"));
		selectProduct.click();
	}
}
