package OmniChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sharePoint {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver o ;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		o = new ChromeDriver();
		
		o.get("https://sgmalifax.sharepoint.com/:f:/s/MalifaxSysteam/EpKEt55UggpJkA2pUv9AGxoBsBxmEUXlRQeRRFYmVmr8Zg?e=5%3aAuzRms&at=9");
		Thread.sleep(2000);
		
		o.findElement(By.id("txtTOAAEmail")).sendKeys("rs@corp.cal4care.com");
		Thread.sleep(2000); 
		o.findElement(By.id("btnSubmitEmail")).click();
		Thread.sleep(60000); 
		// after enter code
		o.findElement(By.id("btnSubmitCode")).click(); // verify button
		Thread.sleep(5000); 
		
		//WebElement d = o.findElement(By.id("id__6"));
		
		Select s = new Select(o.findElement(By.xpath("//i[@name='Upload']")));
		s.selectByIndex(1);
		
		

	}

}
