package dummy.contactListApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestClass extends Signup {

	@Test
	public void testCase1() {
		
		WebElement addContactButton = driver.findElement(By.xpath("//button[@id='add-contact']"));
		addContactButton.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("ashish");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("naik");
		
		WebElement dateOfBirth = driver.findElement(By.xpath("//input[@id='birthdate']"));
		dateOfBirth.sendKeys("1998-03-22");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("ash123@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
		phone.sendKeys("1234567890");
		
		WebElement street1 = driver.findElement(By.xpath("//input[@id='street1']"));
		street1.sendKeys("Thane");
		
		WebElement street2 = driver.findElement(By.xpath("//input[@id='street2']"));
		street2.sendKeys("Mumbai");

		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Kalyan");
		
		WebElement stateProvince = driver.findElement(By.xpath("//input[@id='stateProvince']"));
		stateProvince.sendKeys("Maharashtra");
		
		WebElement postalCode = driver.findElement(By.xpath("//input[@id='postalCode']"));
		postalCode.sendKeys("421404");
		
		WebElement country = driver.findElement(By.xpath("//input[@id='country']"));
		country.sendKeys("India");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		submitButton.click();
		
		
		
		System.out.println("testCase1");
	}
}
