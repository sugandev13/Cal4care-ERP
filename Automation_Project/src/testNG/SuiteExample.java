package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver g;
	long startTime;
	long endTime;

	@BeforeSuite
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		g = new ChromeDriver();
		System.out.println("Browser Launch");
	}

	@Test
	public void openGoogle() {
		startTime = System.currentTimeMillis();
		g.get("https://www.google.co.in");
		System.out.println("Google Launch");
	}
	@Test
	public void openBing() {
		startTime = System.currentTimeMillis();
		g.get("https://www.bing.com");
		System.out.println("Bing Launch");
	}
	@Test
	public void openYahoo() {
		startTime = System.currentTimeMillis();
		g.get("https://www.yahoo.com");
		System.out.println("Yahoo Launch");
	}

	@AfterSuite
	public void closeBrowser() {
		long endTime = System.currentTimeMillis();
		long totalTime = endTime-startTime;
		System.out.println("TotalTime = "+totalTime);
		g.quit();

	}


}
