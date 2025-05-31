package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver a ;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		a = new ChromeDriver();
		
		a.get("https://www.leafground.com/radio.xhtml");
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement rb = a.findElement(By.id("j_idt87:console2:2"));
		//rb.click();
		
		WebElement rb1 = a.findElement(By.id("j_idt87:console2:1"));
		
		boolean status1 = rb.isSelected();
		boolean status2 = rb1.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement Below20 = a.findElement(By.xpath("//*[contains(text(),'1-20 Years')]"));
		Below20.click();
		
		if(!Below20.isSelected()) {
			//Below20.click();
			System.out.println("radio button 1-20 is selected");
		}else {
			System.out.println("radio button 1-20 is not selected");
		}
		
		//*[@id="j_idt87:console2"]/tbody/tr/td[3]/div/div[2]

	}

}
