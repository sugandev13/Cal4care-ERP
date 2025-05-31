package ERP_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ERP_Automation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver e;
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
		
		e.findElement(By.xpath("//*[@class='navbar-left']")).click();
		Thread.sleep(1000);
		
		e.findElement(By.xpath("//*[contains(text(),'Transaction New')]")).click();
		Thread.sleep(3000);
		
		e.findElement(By.xpath("//*[@title='Add New  Invoice']")).click();
		Thread.sleep(2000);
		
		Select e1 = new Select(e.findElement(By.id("priority")));
		e1.selectByIndex(2);
		
		Select e2 = new Select(e.findElement(By.id("vendorName")));
		e2.selectByIndex(9);
		
		Select e3 = new Select(e.findElement(By.id("purchaseType")));
		//e3.selectByValue(" Cabling Expense ");
		e3.selectByVisibleText("Cabling Expense");
	}

}
