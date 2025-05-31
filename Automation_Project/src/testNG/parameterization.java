package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {
	
	@Test
	@Parameters("Name")
	public void paramater(String name) {
		System.out.println("Tha Name is "+name);
	}

}
