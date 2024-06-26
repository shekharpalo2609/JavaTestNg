//4. search mobile cover->Include Out of Stock check box	
package amazon.parallel.ten.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC4 extends LaunchAndQuit{

	@Test
	@Parameters("browser")
	public void searchMobileCover(){
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mobile cover");
		
		WebElement search = driver.findElement(By.cssSelector("[type='submit']"));
		search.click();
		
		//WebElement selectOutOfStock = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[127]"));
		//WebElement selectOutOfStock = driver.findElement(By.xpath("(//input[@type='checkbox'])[124]"));
		//WebElement selectOutOfStock = driver.findElement(By.xpath("(//span[@class = 'a-size-base a-color-base'])[141]"));
		WebElement selectOutOfStock = driver.findElement(By.xpath("//span[contains(text(),'Include Out of Stock')]"));
		
		selectOutOfStock.click();
		System.out.println("TC4 END");
	}
}
