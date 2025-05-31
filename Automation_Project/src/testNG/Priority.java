package testNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 0,enabled = false)
	public void firstTestCase() {
		System.out.println("First");
	}
	@Test(priority = 1)
	public void secondTestCase() {
		System.out.println("Two");
	}
	@Test(priority = 2)
	public void thirdTestCase() {
		System.out.println("Three");
	}
	@Test(priority = 3)
	public void fourthTestCase() {
		System.out.println("Four");
	}

}
