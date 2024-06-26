//6. after launch->click on electronics major tab->select brand as redmi	

package amazon.parallel.ten.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TC6 extends LaunchAndQuit {

	@Test
	@Parameters("browser")
	public void selectRedmi() {
		
		WebElement electronicsMajorTab = driver.findElement(By.xpath("(//a[@tabindex='0'])[12]"));
		electronicsMajorTab.click();
		
		WebElement selectRedmi = driver.findElement(By.xpath("(//div[@class='sl-sobe-carousel-sub-card-image'])[55]"));
		selectRedmi.click();
		
	}
	
	
}
