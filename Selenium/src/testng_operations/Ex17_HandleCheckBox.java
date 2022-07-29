package testng_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex17_HandleCheckBox {

	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "http://the-internet.herokuapp.com/checkboxes";
 
    @Test
    public void test01() throws InterruptedException {
 
        driver = new ChromeDriver();
        driver.get(url);
 
        Thread.sleep(2000);
        
        //Select 
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        //OR
//      WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        
        checkbox1.click();
        
        System.out.println(checkbox1.isSelected());


        Thread.sleep(2000);
      
        
        //Deselect
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        checkbox2.click();
        checkbox2.click();
        

        System.out.println(checkbox2.isSelected());
 
        Thread.sleep(2000);

        driver.quit();
        
        
    }
}
