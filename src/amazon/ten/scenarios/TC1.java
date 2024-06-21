//1. Search shoe->click on 1st shoe	

package amazon.ten.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC1 extends LaunchAndQuit {
	
	
	@Test
	public void selectShoe() {
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("shoe");
		searchBox.sendKeys(Keys.ENTER);
		
		WebElement selectShoe = driver.findElement(By.xpath("(//div[@class = 's-image-padding'])[1]"));
		selectShoe.click();
	}
	
	
	
	
}
