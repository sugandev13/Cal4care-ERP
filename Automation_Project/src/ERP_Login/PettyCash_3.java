package ERP_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;

public class PettyCash_3 extends PettyCash_Two{
	
	@Test
	public void testBillerDropDown() {
		WebElement billerDropDown = e.findElement(By.id("biller_name8"));
		 Select dd = new Select(billerDropDown);
		 dd.selectByVisibleText("Cal4Care Pte Ltd");
		 Assert.assertEquals(dd.getFirstSelectedOption().getText()," Cal4Care Pte Ltd ");
	       

	}

}
