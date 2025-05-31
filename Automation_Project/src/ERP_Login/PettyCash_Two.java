package ERP_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PettyCash_Two extends PettyCash {


	@BeforeClass
	public void transactionNew() throws InterruptedException {
		e.findElement(By.xpath("//*[@class='navbar-left']")).click();
		Thread.sleep(1000);

		e.findElement(By.xpath("//*[contains(text(),'Ledger')]")).click();

		WebElement trans = e.findElement(By.xpath("//*[contains(text(),'Transaction New')]"));
		trans.click();
		Thread.sleep(3000);

		String Name = trans.getText();
		System.out.println(Name);
		String expectedName = "Transaction New";

		if(Name.equals(expectedName)) {
			System.out.println("Test Passed: Page Name is Correct = " + Name);

		}else {
			System.out.println("Test Failed: Page Name is Incorrect = "+ expectedName);
		}
	}

	@Test(priority = 0)
	public void clicksAdd() throws InterruptedException {
		WebElement addButton = e.findElement(By.xpath("//*[@type='button'][@title='Add New']"));
		addButton.click();

		/*
		 * String Name1 = addButton.getText();
		 * System.out.println("The Page Name is "+Name1);
		 */

		e.findElement(By.xpath("//*[@class='sidebar-toggle']")).click();
		Thread.sleep(1000);

		e.navigate().refresh();
		Thread.sleep(3000);

		WebElement pc = e.findElement(By.xpath("//*[@class='nav-link btnn pulse'][@aria-controls='PettyCash']"));
		pc.click();

		/*if(addButton.equals(Name1)) {
				System.out.println("The Page is correct = "+Name1);
			}else
				System.out.println("The Page name is wrong");
		}*/

	}
	@Test(priority = 1)
	public void testBillerDropDown() throws InterruptedException {
		WebElement billerDropDown = e.findElement(By.id("biller_name8"));
		Select dd = new Select(billerDropDown);
		dd.selectByIndex(5);
		//Assert.assertEquals(dd.getFirstSelectedOption().getText(),"DCARE Technologies India Pvt Ltd.");
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void prioritySelect() throws InterruptedException {
		WebElement p = e.findElement(By.id("priority"));
		Select dd1 = new Select(p);
		dd1.selectByIndex(2);
		//Assert.assertFalse(dd1.getFirstSelectedOption().getText().isEmpty());
		System.out.println("The Selected DD is "+dd1);
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 3)
	public void desc() throws InterruptedException {
		WebElement d = e.findElement(By.xpath("//*[@formcontrolname='PC_Description'][@row='2']"));
		d.sendKeys("Test Description");
		//Assert.assertEquals(d.getAttribute("value"), "Test Description");
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void selectType() throws InterruptedException {
			WebElement type = e.findElement(By.id("PC_Type"));
			Select type1 = new Select(type);
			type1.selectByVisibleText(" Credit ");
			Thread.sleep(2000);
			
	}
	
	@Test(priority = 5)
	public void amountField() throws InterruptedException {
		WebElement amt = e.findElement(By.xpath("//*[@id=\"PettyCash\"]/div[3]/div/div[2]/input"));
		amt.sendKeys("1203");
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void after() {
		System.out.println("All tests completed.");
	}

}
