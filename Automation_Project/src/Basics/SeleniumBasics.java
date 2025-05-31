package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) throws InterruptedException {


		WebDriver s;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		s = new ChromeDriver();
		
		s.get("https://erp1.cal4care.com:4002/#/login");
		s.manage().window().maximize();
		Thread.sleep(3000);
		
		s.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		
		// find the color
		WebElement buttonColor = s.findElement(By.id("send_otp_id"));
		String color = buttonColor.getCssValue("background");
		System.out.println("The Button Color is "+color);
		
		// find the size 
		
		WebElement buttonSize = s.findElement(By.id("send_otp_id"));
		int buttonHeight = buttonSize.getSize().getHeight();
		int buttonWidth = buttonSize.getSize().getWidth();
		System.out.println("The Height is "+buttonHeight +" "+"The Button Width is "+buttonWidth);
		
		// find the position
		
		WebElement buttonPosition = s.findElement(By.id("send_otp_id"));
		Point pos = buttonPosition.getLocation();
		int xValue = pos.getX();
		int yValue = pos.getY();
		System.out.println("The X Value is "+ xValue +" "+"The Y Value is "+yValue);
		
		s.close();

	}

}
