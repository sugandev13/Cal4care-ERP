package OmniChannel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver o ;
		System.setProperty("webdriver.chrome.driver","D:\\New\\Lenova\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		o = new ChromeDriver();

		try {

			o.get("https://developtesting.my3cx.sg:4001/#/call-report");
			o.manage().window().maximize();

			o.findElement(By.xpath("//*[contains(text(),'PASSWORD LOGIN')]")).click();

			o.findElement(By.id("company_name")).sendKeys("AMKTC");
			o.findElement(By.id("username")).sendKeys("AMKTC_Admin1");
			o.findElement(By.id("password")).sendKeys("2pq1n0o4k8");

			o.findElement(By.xpath("//*[@value='Login']")).click();
			Thread.sleep(3000);

			o.findElement(By.xpath("//*[contains(text(),'Reports ')]")).click();
			Thread.sleep(1000);


			o.findElement(By.xpath("//*[contains(text(),'3CX Call Report')]")).click();
			Thread.sleep(50000);

			//o.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			//o.findElement(By.xpath("//*[contains(text(),'Total Call Report')]")).click();
			//Thread.sleep(2000);
			
			/*
			 * o.findElement(By.id("from_dt")).sendKeys("01-03-2024"); Thread.sleep(8000);
			 * o.findElement(By.id("to_dt")).sendKeys("31-03-2024");
			 * o.findElement(By.xpath("//*[contains(text(),'Generate Report')]")).click();
			 * Thread.sleep(8000);
			 */

			JavascriptExecutor js = (JavascriptExecutor)o;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);


			//List<WebElement> downLoadButtons = o.findElement(By.xpath("//*[@class='fas fa-download downloadRecord mr-2 voicemail-icons']"));

			List<WebElement> downloadButtons = o.findElements(By.id("download_link"));
			System.out.println(downloadButtons.size());
			
			//Multi-threading to process faster
			ExecutorService executor = Executors.newFixedThreadPool(10); // 10 concurrent downloads

			for (WebElement button : downloadButtons) {
			    executor.submit(() -> {
			        try {
			            js.executeScript("arguments[0].click();", button);
			            Thread.sleep(2000); // Adjust if necessary, or remove if downloads do not need a delay
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			    });
			}

			// Shutdown executor properly
			executor.shutdown();
			try {
			    executor.awaitTermination(10, TimeUnit.MINUTES); // Wait for all tasks to finish
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
			
			/*
			 * ((JavascriptExecutor)o).executeScript("Windows.open()"); ArrayList<String>
			 * tab2 = new ArrayList<String>(o.getWindowHandles());
			 * o.switchTo().window(tab2.get(1)); o.get(
			 * "https://sgmalifax.sharepoint.com/:f:/s/MalifaxSysteam/EpKEt55UggpJkA2pUv9AGxoBsBxmEUXlRQeRRFYmVmr8Zg?e=5%3aAuzRms&at=9"
			 * ); Thread.sleep(2000);
			 * o.findElement(By.id("txtTOAAEmail")).sendKeys("rs@corp.cal4care.com");
			 * Thread.sleep(2000); o.findElement(By.id("btnSubmitEmail")).click();
			 * Thread.sleep(10000);
			 * 
			 * o.findElement(By.id("btnSubmitCode")).click();
			 */


		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e);

		}

	}

}
