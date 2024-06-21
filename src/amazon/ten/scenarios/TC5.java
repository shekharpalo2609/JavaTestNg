//5. search camera->click on 35th camera	
package amazon.ten.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC5 extends LaunchAndQuit {

	@Test
	@Parameters("browser")
	public void selectCamera() {
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("camera");
		searchItem.sendKeys(Keys.ENTER);
		
		WebElement nextPage = driver.findElement(By.cssSelector("[aria-label='Go to page 2']"));
		nextPage.click();
		
		WebElement selectCamera = driver.findElement(By.partialLinkText("BLACKPOOL 4K Action Camera with Accessories Kit | WiFi | 16 MP | 170 Degree Wide"));
		selectCamera.click();
	}
	
}
