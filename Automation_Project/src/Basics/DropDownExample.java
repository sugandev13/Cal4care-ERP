package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver s;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		s = new ChromeDriver();

		s.get("https://www.amazon.in");
		s.manage().window().maximize();
		Thread.sleep(2000);

		WebElement dd = s.findElement(By.id("searchDropdownBox"));

		Select dd1 = new Select(dd);

		/*List <WebElement>listOfOptions=dd1.getOptions();
		int dd2 = listOfOptions.size();
		System.out.println("List Of Options "+dd2);
		
		// print eachoptions
		for(WebElement option : listOfOptions) {
			System.out.println(option.getText());*/
		
		List <WebElement>listOfOptions=dd1.getOptions();
		int size = listOfOptions.size();
		System.out.println("The List Size is "+size);
		
		for(WebElement options:listOfOptions) {
			System.out.println(options.getText());
		}

	}

}
