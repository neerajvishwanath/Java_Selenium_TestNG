package testng_operations;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
 
public class Ex19_HandleMouseHover {
 
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "http://the-internet.herokuapp.com/hovers";
 
    @Test
    public void test01() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url);


        // Mouse Hover
        WebElement secondElement = driver.findElement(By.xpath("//div[@class='figure'][2]"));

        //WebElement secondElement = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/img"));

        Actions action = new Actions(driver);

        action.moveToElement(secondElement).perform();

        WebElement text = driver.findElement(By.xpath("//*[text()='name: user2']"));

        String expectedText = "user2";
        String actualText = text.getText();
        assertTrue(actualText.contains(expectedText));
        System.out.println(actualText);

        /*
        if(text.getText().contains("user2")) {
            System.out.println("Mouse hovered");
        }
        else {
            System.out.println("Mouse not hovered");
        }
        */

        Thread.sleep(2000);

        driver.quit();
        
    }
}