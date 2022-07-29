package testng_operations;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex27_HandleAssertion {

	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://parabank.parasoft.com/parabank/index.htm";

  @Test
  public void test01() throws InterruptedException {


        driver = new ChromeDriver();
        driver.get(url);

        Thread.sleep(2000);


        //Assert Logo
        boolean logo = driver.findElement(By.className("logo")).isDisplayed();
        assertTrue(logo);
        System.out.println(logo);
        
        //Assert Title
        String expectedTitle = "ParaBank | Welcome | Online Banking";
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
        System.out.println(actualTitle);
        
        //Assert Text
//        String expectedText = "© Parasoft. All rights reserved.";
//        String actualText = driver.findElement(By.className("copyright")).getText();
//        assertEquals(actualText, expectedText);
//        System.out.println(actualText);
        
        
        
        //Assert Text using contains
        String expectedTextContains = "© Parasoft.";
        String actualTextContains = driver.findElement(By.className("copyright")).getText();
        assertTrue(actualTextContains.contains(expectedTextContains));
        System.out.println(actualTextContains);
        
        
        Thread.sleep(2000);
        
        driver.close();
}
}
