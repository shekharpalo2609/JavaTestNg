package dataProvider.facebook.registration;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_FacebookRegistration extends LaunchAndQuit{

	@DataProvider(name = "details")
	public Object[][] details(){
		
		Object[][] data = new Object[1][3];
		data[0][0] = "Shekhar";
		data[0][1] = "Palo";
		data[0][2] = "1234567890";
		
		return data;
	}
	
	@Test(dataProvider = "details")
	public void facebookRegistration(String firstName, String lastName, String mobileNo) throws EncryptedDocumentException, IOException {
		
		WebElement createAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createAccount.click();
		
		WebElement fName = driver.findElement(By.name("firstname"));
		fName.sendKeys(firstName);
		
		WebElement lName = driver.findElement(By.name("lastname"));
		lName.sendKeys(lastName);
		
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys(mobileNo);
		
		WebElement day = driver.findElement(By.id("day"));
		Select selectDay = new Select(day);
		selectDay.selectByIndex(0);
		
		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		selectYear.selectByValue("2000");
		
		WebElement gender = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		gender.click();
		
		FileInputStream input = new FileInputStream("C:\\Users\\ishan\\OneDrive\\Desktop\\DDT Selenium excel\\fb registration.xlsx");
		Workbook workbook = WorkbookFactory.create(input);
		String pwdValue = workbook.getSheet("fb_pwd").getRow(3).getCell(0).getStringCellValue();
		WebElement pwd = driver.findElement(By.id("password_step_input"));
		pwd.sendKeys(pwdValue);
				
	}
}
