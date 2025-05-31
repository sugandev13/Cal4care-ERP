package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver w ;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		w = new ChromeDriver();

		w.get("https://www.leafground.com/window.xhtml");
		w.manage().window().maximize();
		Thread.sleep(2000);

		String oldWindow = w.getWindowHandle();

		WebElement window1 = w.findElement(By.id("j_idt88:new"));
		window1.click();
		Thread.sleep(2000);

		Set<String>newWindow = w.getWindowHandles();

		for (String window2 : newWindow) {
			w.switchTo().window(window2);
			Thread.sleep(2000);

			WebElement tab = w.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[1]/input"));
			tab.sendKeys("Test");
			Thread.sleep(2000);
			w.switchTo().window(oldWindow);
		}

	}

}
