package javascriptExecutor.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollToElement {

	@Test

	public void scrollTo() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		WebElement yourAccount = driver.findElement(By.linkText("Your Account"));
		Point point = yourAccount.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println(x);
		System.out.println(y);

		Thread.sleep(1500);
		JavascriptExecutor executor = driver;
		executor.executeScript("window.scrollBy(" + x + "," + y + ")");
	}
}
