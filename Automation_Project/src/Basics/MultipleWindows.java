package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver a ;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		a = new ChromeDriver();
		
		a.get("https://www.leafground.com/alert.xhtml");
		a.manage().window().maximize();
		Thread.sleep(5000);
		
		a.switchTo().newWindow(WindowType.TAB);
		a.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String tab2 = a.getWindowHandle();
		System.out.println(tab2);
		
		Set<String>tab3 = a.getWindowHandles();
		
		for (String tabFocus : tab3) {
			a.switchTo().window(tabFocus);
		}
		
		Thread.sleep(2000);
		
		WebElement userName = a.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		
		WebElement passWord = a.findElement(By.xpath("//input[@name='password']"));
		passWord.sendKeys("admin123");
		Thread.sleep(1000);

	}

}
