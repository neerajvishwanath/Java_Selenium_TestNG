package jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex03_HandleElements {
	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://parabank.parasoft.com/parabank/register.htm";

  @Test
  public void test01() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(url);

        Thread.sleep(3000);
  
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        //Name
        js.executeScript("document.getElementsByName('customer.firstName')[0].value='john';" );
        
        Thread.sleep(3000);
        
      //ID
        js.executeScript("document.getElementById('customer.lastName').value='Cena';");
//        js.executeScript("document.getElementById('customer.lastName').click();");
        Thread.sleep(2000);
        
      //Class
        js.executeScript("document.getElementsByClassName('input')[4].value='Add';");

        Thread.sleep(2000);

        //Tag
        js.executeScript("document.getElementsByTagName('input')[6].value='City';");

        Thread.sleep(2000);

        //Query Selector
        js.executeScript("document.querySelector('#loginPanel > form > div:nth-child(5) > input').click();");
 
        Thread.sleep(2000);
        driver.quit();
  }
}
