package test_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) {

		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com");
	}

}
