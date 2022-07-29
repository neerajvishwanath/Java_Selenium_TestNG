package testng_operations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ex18_HandleKeys {

	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url1 = "https://the-internet.herokuapp.com/key_presses";
    String url2= "https://the-internet.herokuapp.com/login";
 
    @Test
    public void test01() throws InterruptedException {
 
        driver = new ChromeDriver();
        driver.get(url1);
        //driver.get(url2);
        Thread.sleep(2000);
 
        
        //URL 1
        Actions action = new Actions(driver);
        //perform --> performing one key operation  
        action.sendKeys(Keys.SPACE).perform();
        WebElement textElement = driver.findElement(By.id("result"));
        String text = textElement.getText();
        assertEquals(text, "You entered: SPACE");
        System.out.println(text);
		

        /*
        //URL 2 - Chord(CTRL + Z)
        WebElement ele = driver.findElement(By.id("username"));
        ele.sendKeys("myuser");
        Thread.sleep(1000);
        ele.sendKeys(Keys.chord(Keys.CONTROL, "z"));
        */

        Thread.sleep(2000);
        driver.quit();
        

    
    }
    
}
