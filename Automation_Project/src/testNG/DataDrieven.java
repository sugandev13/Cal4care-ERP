package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrieven {
	
	
	@Test
	public void login() throws InterruptedException {
		WebDriver g;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		g = new ChromeDriver();
		
		g.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		g.manage().window().maximize();
		Thread.sleep(2000);
		
		g.findElement(By.xpath("//*[@name = 'username']")).sendKeys("uName");
		g.findElement(By.xpath("//*[@name = 'password']")).sendKeys("pWord");
		g.findElement(By.xpath("//*[@type= 'submit']")).click();
		
	}

}
