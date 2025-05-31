package testNG;

import org.testng.annotations.Test;

public class Grouping {
    @Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Apple One");

	}
    @Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Apple Two");

	}
    @Test(groups = {"Apple"})
	public void nothing1() {
		System.out.println("Nothing One");

	}
    @Test(groups = {"Nothing"})
	public void nothing2() {
		System.out.println("Nothing Two");

	}
    @Test(groups = {"Oppo"})
	public void oppo1() {
		System.out.println("Oppo One");

	}
    @Test(groups = {"Oppo"})
	public void oppo2() {
		System.out.println("oppo Two");

	}
    @Test(groups = {"Oppo"})
	public void moto1() {
		System.out.println("Moto One");

	}
    @Test(groups = {"Nothing"})
	public void moto2() {
		System.out.println("Moto Two");

	}

}
