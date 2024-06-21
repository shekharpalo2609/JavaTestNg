package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mobile cover");
		
		WebElement search = driver.findElement(By.cssSelector("[type='submit']"));
		search.click();
		
		//WebElement selectOutOfStock = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[124]"));
		//WebElement selectOutOfStock = driver.findElement(By.xpath("(//input[@type='checkbox'])[124]"));
		WebElement selectOutOfStock = driver.findElement(By.xpath("(//span[@class = 'a-size-base a-color-base'])[141]"));
		selectOutOfStock.click();
		
		WebElement selectMouseCover = driver.findElement(By.partialLinkText("iTronix Waterproof Mobile Pouch Cover"));
		selectMouseCover.click();
		System.out.println("TC4 END");
	}

}
