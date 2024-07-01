package assertAmazon_10Scenario;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit {

	WebDriver driver;

	@BeforeMethod
	public void launchAmazon() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void closeAmazon() {
		driver.quit();
	}
}
