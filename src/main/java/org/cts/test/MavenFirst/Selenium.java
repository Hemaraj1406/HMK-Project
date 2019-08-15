package org.cts.test.MavenFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMARAJ\\eclipse-workspace\\MavenFirst\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=75.0.3770.90/");
	}

}
