package testng_other_operations;

import org.testng.annotations.Test;

public class Ex09_TestDependency {
	
	//We should use this test dependency approach only when we really need it.
    //Ideally tests should be independent from each other
	
	@Test
	public void test01() {
		System.out.println("Launch the browser");
	}
	
	@Test(dependsOnMethods = "test01")
	public void test02() {
	      System.out.println("Launch the app");
	}
	
	@Test(dependsOnMethods = "test02")
	public void test03() {
	      System.out.println("Capture page title");
	}
	
	@Test(dependsOnMethods = "test03")
	public void test04() {
		System.out.println("Check page element visibility");
	      //assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"test04", "test03"})
	public void test05() {
	      System.out.println("Check page element enabled");
	}
	
}
