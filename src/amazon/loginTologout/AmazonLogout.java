package amazon.loginTologout;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonLogout {

	@Test
	static void logout() throws EncryptedDocumentException, IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

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

		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mobile");
		searchItem.sendKeys(Keys.ENTER);

		WebElement selectItem = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		selectItem.click();

		Set<String> windowHandle = driver.getWindowHandles();
		Iterator<String> parentChildId = windowHandle.iterator();
		String parentId = parentChildId.next();
		String childId = parentChildId.next();
		driver.switchTo().window(childId);

		WebElement wishList = driver.findElement(By.id("add-to-wishlist-button-submit"));
		wishList.click();
		Thread.sleep(3000);
		driver.navigate().refresh();

		WebElement addToCart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		addToCart.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		/*
		 * WebElement closeCart =
		 * driver.findElement(By.id("attach-close_sideSheet-link")); closeCart.click();
		 */
		
		WebElement accountName = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		actions.moveToElement(accountName).perform();
		Thread.sleep(1000);
		
		WebElement signOut = driver.findElement(By.xpath("(//span[@class='nav-text'])[21]"));
		signOut.click();
	}
}
