package parallel.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearch {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void testcase1(String browserName) {

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleContains("Goo"));

		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("Mumbai");
		searchBox.sendKeys(Keys.ENTER);

	}
}
