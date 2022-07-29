package config_utility_base_1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	
	 @Test
	    public void test01() throws InterruptedException {
	 
	        WebElement aboutUsLink = driver.findElement(By.linkText("About Us"));
	        aboutUsLink.click();
	        String expectedTitle = "ParaBank | About Us";
	        String actualTitle = driver.getTitle();
	        System.out.println(driver.getTitle());
	        assertEquals(actualTitle, expectedTitle);
	        Thread.sleep(1000);
	 
	    }
	 
	    @Test
	    public void test02() throws InterruptedException {
	 
	        WebElement servicesLink = driver.findElement(By.linkText("Services"));
	        servicesLink.click();
	        String expectedTitle = "ParaBank | Services";
	        String actualTitle = driver.getTitle();
	        System.out.println(driver.getTitle());
	        assertEquals(actualTitle, expectedTitle);
	        Thread.sleep(1000);
	 
	    }

	
}
