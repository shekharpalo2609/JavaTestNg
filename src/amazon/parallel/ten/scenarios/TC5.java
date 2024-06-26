//5. search camera->click on 35th camera	
package amazon.parallel.ten.scenarios;

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
		
		WebElement select35thCamera = driver.findElement(By.xpath("//span[normalize-space()='Nikon D7500 DX-Format Digital SLR Body (Black)']"));
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.titleContains("Camera"));
		 */
		select35thCamera.click();
	}
	
}
