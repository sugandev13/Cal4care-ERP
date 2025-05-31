package ERP_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


public class PettyCash {
	WebDriver e;

	@BeforeClass
	public void erpLogin() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		e = new ChromeDriver();

		e.get("https://erp1.cal4care.com:4002/#/login");
		e.manage().window().maximize();

		e.findElement(By.id("Login-tab")).click();
		Thread.sleep(2000);

		e.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("dev");
		e.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("welcome");
		Thread.sleep(1000);
		e.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);

		e.findElement(By.xpath("//*[@formcontrolname='verify_otp_ctrl']")).sendKeys("654987");
		Thread.sleep(2000);

		e.findElement(By.id("send_otp_id")).click();
		Thread.sleep(5000);

		e.navigate().refresh();
		Thread.sleep(5000);
	}

	@AfterClass
	public void teardown() {
		System.out.println("AfterClass");
	}

}
