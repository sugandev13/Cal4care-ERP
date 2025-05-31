package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void openGoogle() throws InterruptedException {
		WebDriver a ;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		a = new ChromeDriver();

		a.get("https://erp1.cal4care.com:4002/#/");
		a.manage().window().maximize();
		
		WebElement loginTab = a.findElement(By.id("Login-tab"));
		loginTab.click();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		WebElement userName = a.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("dev");
		
		WebElement passWord = a.findElement(By.xpath("//input[@placeholder='Password']"));
		passWord.sendKeys("welcome");
		passWord.sendKeys(Keys.RETURN);
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		WebElement otpButton = a.findElement(By.xpath("//input[@formcontrolname='verify_otp_ctrl']"));
		otpButton.sendKeys("654987");
		
		WebElement button = a.findElement(By.id("send_otp_id"));
		button.click();
		Thread.sleep(2000);
	}
	@Test
	public void openBing() throws InterruptedException {
		WebDriver a ;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		a = new ChromeDriver();

		a.get("https://www.leafground.com/drag.xhtml;jsessionid=node0optobdpd62kqu33ui82rc2p2207116.node0");
		
		WebElement dragElement = a.findElement(By.id("form:drag"));
		WebElement dropTo = a.findElement(By.id("form:drop_content"));
		
		Actions actions = new Actions(a);
		actions.clickAndHold(dragElement).moveToElement(dropTo).release(dropTo).build().perform();
		System.out.println("Drag and Drop is Completed");
		Thread.sleep(2000);
	}

}
