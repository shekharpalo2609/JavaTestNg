package iTest.listener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(I_Test_Listener.class)
public class Testlistener_Amazon extends I_Test_Listener {

	@Test
	public void selectShoe() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("shoe");
		searchBox.sendKeys(Keys.ENTER);

	}
	
	@Test
	public void assertSelectShoe() {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.xpath("//inputs[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("shoe");
		searchBox.sendKeys(Keys.ENTER);

	}
}
