package dataProvider.facebook.registration;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchAndQuit {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launchFacebook(String browserName) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}

		if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}

		if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void quitFacebook() {
		driver.quit();
	}
}
