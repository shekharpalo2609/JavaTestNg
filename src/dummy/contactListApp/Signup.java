package dummy.contactListApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Signup {

	WebDriver driver;
	
	@BeforeMethod
	public void signUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		
		/*
		 * WebElement signUpButton =
		 * driver.findElement(By.xpath("//button[@id='signup']")); signUpButton.click();
		 * 
		 * WebElement firstName =
		 * driver.findElement(By.xpath("//input[@id='firstName']"));
		 * firstName.sendKeys("shekhar");
		 * 
		 * WebElement lastName =
		 * driver.findElement(By.xpath("//input[@id='lastName']"));
		 * lastName.sendKeys("palo");
		 */
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("shekhar123@gmail.com");
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("shekhar@123");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		submitButton.click();
		
	}
	
}
