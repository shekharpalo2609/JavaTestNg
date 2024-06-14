package amazon.loginTologout;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlgraphics.util.dijkstra.EdgeDirectory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonWishlist {

	@Test
	void addToWishlist() throws EncryptedDocumentException, IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		String credSheet = "credentials";
		FileInputStream file = new FileInputStream("C:\\Users\\ishan\\git\\Selenium\\TestData\\Amazon login.xlsx");
		Workbook workbook = WorkbookFactory.create(file);

		WebElement signInHover = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions actions = new Actions(driver);
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

		/*
		 * WebElement closeWishList =
		 * driver.findElement(By.xpath("(//span[@class='a-button-text'])[43]"));
		 * closeWishList.click();
		 */		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		driver.quit();
	}

}
