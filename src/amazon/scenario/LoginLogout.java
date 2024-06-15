package amazon.scenario;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginLogout {

	WebDriver driver;

	@BeforeMethod
	void login() throws InterruptedException, EncryptedDocumentException, IOException {

		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);

		String credSheet = "credentials";
		FileInputStream file = new FileInputStream("C:\\Users\\ishan\\git\\Selenium\\TestData\\Amazon login.xlsx");
		Workbook workbook = WorkbookFactory.create(file);

		WebElement signInHover = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		actions.moveToElement(signInHover).perform();

		WebElement signInButton = driver.findElement(By.xpath("(//span[@class = 'nav-action-inner'])[1]"));
		signInButton.click();

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		String emailCell = workbook.getSheet(credSheet).getRow(0).getCell(0).getStringCellValue();
		email.sendKeys(emailCell);
		email.sendKeys(Keys.ENTER);

		WebElement password = driver.findElement(By.name("password"));
		String passwordCell = workbook.getSheet(credSheet).getRow(9).getCell(1).getStringCellValue();
		password.sendKeys(passwordCell);
		password.sendKeys(Keys.ENTER);
		System.out.println("before method");
	}

	@AfterMethod
	void logout() {

		WebElement accountName = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(accountName).perform();

		WebElement signOut = driver.findElement(By.id("nav-item-signout"));
		signOut.click();
		System.out.println("after method");

	}

}
