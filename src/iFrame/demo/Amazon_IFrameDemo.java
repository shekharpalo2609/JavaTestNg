package iFrame.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Amazon_IFrameDemo {

	WebDriver driver;

	@Test
	public void loginToCheckout() throws EncryptedDocumentException, IOException {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		String emailCell = workbook.getSheet(credSheet).getRow(1).getCell(0).getStringCellValue();
		email.sendKeys(emailCell);
		email.sendKeys(Keys.ENTER);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement password = driver.findElement(By.name("password"));
		String passwordCell = workbook.getSheet(credSheet).getRow(1).getCell(1).getStringCellValue();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(password));

		password.sendKeys(passwordCell);
		password.sendKeys(Keys.ENTER);

		WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBox.sendKeys("shoe", Keys.ENTER);

		WebElement selectProduct = driver
				.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		selectProduct.click();

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();

		String parentId = iterator.next();
		String childId = iterator.next();
		driver.switchTo().window(childId);

		WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addToCart.click();

		WebElement proceedToBuy = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		proceedToBuy.click();

		WebElement selectAddressOption = driver.findElement(By.xpath("(//span[@class='break-word'])[5]"));
		selectAddressOption.click();

		WebElement useThisAddressButton = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		useThisAddressButton.click();

		WebElement addCredit_DebitCard = driver
				.findElement(By.xpath("//span[normalize-space()='Credit or debit card']"));
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.titleContains("Checkout"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addCredit_DebitCard.click();

		WebElement enterCardDetails = driver.findElement(By.xpath("(//a[normalize-space()='Enter card details'])[1]"));
		enterCardDetails.click();

		driver.switchTo().frame(driver.findElement(By.name("ApxSecureIframe")));

		WebElement cardNumber = driver.findElement(By.name("addCreditCardNumber"));
		cardNumber.sendKeys("5305620224857900");

		WebElement expiryDate = driver.findElement(By.name("ppw-expirationDate_month"));
		Select selectDate = new Select(expiryDate);
		selectDate.selectByIndex(2);

		WebElement selectExpiryYear = driver.findElement(By.name("ppw-expirationDate_month"));
		Select selectYear = new Select(selectExpiryYear);
		selectYear.selectByIndex(6);

		WebElement enterButton = driver.findElement(By.name("ppw-widgetEvent:AddCreditCardEvent"));
		enterButton.click();

		driver.switchTo().defaultContent();

		WebElement cvvNumber = driver.findElement(By.name("addCreditCardVerificationNumber0"));
		cvvNumber.sendKeys("111");

	}
}
