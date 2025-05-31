package Aroflo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aroflo_AUto {

	public static void main(String[] args) throws InterruptedException {

		WebDriver aroflo;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		aroflo=new ChromeDriver();

		aroflo.get("https://office.aroflo.com/");
		aroflo.manage().window().maximize();
		Thread.sleep(3000);

		aroflo.findElement(By.xpath("//input[@name='username']")).sendKeys("Emerge");
		Thread.sleep(5000);
		aroflo.findElement(By.xpath("//input[@name='password']")).sendKeys("Emerge2025!");
		Thread.sleep(3000);
		aroflo.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20000);
		aroflo.findElement(By.xpath("//*[@class='af-btn af-btn--full af-btn--seaGreen af-bold']")).click();
		Thread.sleep(9000);

		aroflo.findElement(By.xpath("//button[@href='&tid=na'][@class='afBtn afBtn__fill menuBtn ']")).click();
		Thread.sleep(3000);

		aroflo.findElement(By.xpath("//div[starts-with(text(),'Clients')]")).click();
		Thread.sleep(12000);

		aroflo.findElement(By.xpath("//input[@name='compsearch']")).sendKeys("0415 724 167");
		Thread.sleep(3000);

		aroflo.findElement(By.xpath("//input[@name='search']")).click();
		Thread.sleep(3000);

		WebElement table = aroflo.findElement(By.xpath("//*[@id=\"tblClients\"]"));
		List<WebElement> rows = table.findElements(By.xpath("//*[@id=\"tblClients\"]/tbody/tr[1]/td[2]/a"));

		// Check if there are any rows
		if (rows.size() > 0) {
			// Click the first row
			rows.get(0).click();
		} else {
			System.out.println("No rows found in the table.");
		}

		//get url

		String act_url=aroflo.getCurrentUrl();
		System.out.println(act_url);

		((JavascriptExecutor)aroflo).executeScript("window.open()");
		ArrayList<String> tab2 = new ArrayList<String>(aroflo.getWindowHandles());
		aroflo.switchTo().window(tab2.get(1));
		aroflo.get(act_url);
		Thread.sleep(3000);

	}

}
