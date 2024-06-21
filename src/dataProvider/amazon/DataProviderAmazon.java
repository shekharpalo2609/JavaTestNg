//Login to amazon application with 5 set of data using Data provider concept

package dataProvider.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAmazon {

	@DataProvider(name = "credentials")
	public Object[][] loginData(){
		
		Object[][] data = new Object[5][2];
		
		data[0][0] = "shekhar@gmail.com";
		data[0][1] = "shekhar@123";
		
		data[1][0] = "ashish@gmail.com";
		data[1][1] = "ashish@123";
		
		data[2][0] = "mohit@gmail.com";
		data[2][1] = "mohit@123";
		
		data[3][0] = "ganesh@gmail.com";
		data[3][1] = "ganesh@123";
		
		data[4][0] = "deepak@gmail.com";
		data[4][1] = "deepak@123";
		
		return data;
	}
	
	@Test(dataProvider = "credentials")
	public void amazonLogin(String username, String pwd) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(username);
		email.sendKeys(Keys.ENTER);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pwd);
		password.sendKeys(Keys.ENTER);
	}
}
