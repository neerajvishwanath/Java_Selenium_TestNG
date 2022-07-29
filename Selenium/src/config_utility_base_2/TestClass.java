package config_utility_base_2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{
	
	@Test
    public void test01() throws InterruptedException {

        Thread.sleep(2000);

        WebElement openNewAccLink = driver.findElement(By.linkText("Open New Account"));
        openNewAccLink.click();
 
        Thread.sleep(2000);

        String expectedTitle = "ParaBank | Open Account";
        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        assertEquals(actualTitle, expectedTitle);
        Thread.sleep(1000);
 
    }
 
    @Test
    public void test02() throws InterruptedException {
 
        Thread.sleep(2000);

        WebElement transferFundsLink = driver.findElement(By.linkText("Transfer Funds"));
        transferFundsLink.click();
 
        Thread.sleep(2000);
 
        String expectedTitle = "ParaBank | Transfer Funds";
        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        assertEquals(actualTitle, expectedTitle);
        Thread.sleep(1000);


    }
	
}
