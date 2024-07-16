package broken.lomks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinksDemo {

	@Test
	public void getBrokenKinks() throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("Total links in amazon home page: " + count);

		// getting the URL of each one of them
		for (int i = 0; i < count; i++) {
			WebElement s1 = links.get(i);
			String link = s1.getAttribute("href");
			System.out.println(link);
			// String linkText = s1.getText();
			// System.out.println(linkText);
			verifyLinks(link);
		}
	}

	static void verifyLinks(String URLs) throws IOException {
		try {
			URL url = new URL(URLs);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			if (con.getResponseCode() == 200) {
				System.out.println("link is valid");
			} else {
				System.out.println("link is not valid");
			}
		} 
		catch (MalformedURLException | NullPointerException neme) {
			System.out.println("Link was null");
		} 
		
	}

}
