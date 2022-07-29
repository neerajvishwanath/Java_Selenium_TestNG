package testng_other_operations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex10_Logs {
	
	@Test 
	public void test01() {
		 
		 System.out.println("Launching chrome browser");
		 Reporter.log("Chrome Browser is launched");
		 
		 System.out.println("Launching AUT App1");
		 Reporter.log("AUT App1 is launched");
	 }
	
	@Test
	public void test02(){
		
		System.out.println("Launching firefox browser");
        Reporter.log("Firefox browser is launched");
 
        System.out.println("Launching AUT App2");
        Reporter.log("AUT App2 is launched");
	}
}
