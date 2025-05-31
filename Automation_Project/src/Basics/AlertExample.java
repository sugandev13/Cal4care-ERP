package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver a ;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		a = new ChromeDriver();
		
		a.get("https://www.leafground.com/alert.xhtml");
		a.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement AlertSimple = a.findElement(By.id("j_idt88:j_idt91"));
		AlertSimple.click();
		
		Alert alert = a.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		
		WebElement AlertPrompt = a.findElement(By.id("j_idt88:j_idt104"));
		AlertPrompt.click();
		
		
		Alert PromptAlert = a.switchTo().alert();
		Thread.sleep(1000);
		PromptAlert.sendKeys("Testing");
		Thread.sleep(1000);
		PromptAlert.accept();

	}

}
