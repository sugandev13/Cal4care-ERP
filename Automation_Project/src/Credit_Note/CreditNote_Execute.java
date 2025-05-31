package Credit_Note;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreditNote_Execute {
	WebDriver e;
	
	@BeforeClass
	public void creditNote() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		e = new ChromeDriver();
		
		e.get("https://erp1.cal4care.com:4002/#/login");
		e.manage().window().maximize();
		Thread.sleep(3000);
		
		e.findElement(By.id("Login-tab")).click();
		Thread.sleep(2000);
		
		e.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("dev");
		e.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("welcome");
		Thread.sleep(2000);
		e.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		
		e.findElement(By.xpath("//*[@formcontrolname='verify_otp_ctrl']")).sendKeys("654987");
		Thread.sleep(2000);
		
		e.findElement(By.id("send_otp_id")).click();
		Thread.sleep(5000);
		
		e.navigate().refresh();
		Thread.sleep(5000);
		
	}
	@Test(priority = 0)
	public void sideMenuBar() throws InterruptedException {
		/*
		 * e.findElement(By.xpath("//*[@class='navbar-left']")).click();
		 * Thread.sleep(1000);
		 */		
		Actions a = new Actions(e);
		WebElement mainMenu = e.findElement(By.xpath("//a[@href='#/bing--']"));
		a.moveToElement(mainMenu).perform();      
		
		WebElement subMenu = e.findElement(By.xpath("//a[@href='#/TransactionApproval']"));
		a.moveToElement(subMenu).perform();
		
		WebElement subMenu2 = e.findElement(By.xpath("//a[@href='#/creditnote']"));
		a.moveToElement(subMenu2).perform();
		subMenu2.click();
		
		Thread.sleep(2000);
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)e;
		 * js.executeScript("window.scrollBy(1000)",subMenu2);
		 */
		
	}
	
	@Test(priority = 1)
	public void creditNoteAdd() {
		WebElement add = e.findElement(By.xpath("//button[@title='Add Credit Note'][@type='button']"));
		add.click();
	}
	
	
	@AfterClass
	public void print() {
		System.out.println("Test is Completed");
	}

}
