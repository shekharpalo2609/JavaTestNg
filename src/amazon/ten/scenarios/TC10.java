//10. search shoe->go back go home page	
package amazon.ten.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC10 extends LaunchAndQuit {

	@Test
	@Parameters("browser")
	public void searchShoe() {

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("shoe");
		searchBox.sendKeys(Keys.ENTER);
		
		driver.navigate().back();
	}
}
