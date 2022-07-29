package testng_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class Ex09_HandleElementLocators_Way2 {

    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    //String url = "https://parabank.parasoft.com/parabank/index.htm";
    String url = "http://www.facebook.com";

  @Test
  public void test01() throws Exception {

        driver = new ChromeDriver();
        driver.get(url);

        Thread.sleep(3000);

        //LinkText
        /*WebElement aboutUsPageLink = driver.findElement(By.linkText("About Us"));
        System.out.println(aboutUsPageLink.isDisplayed());
        System.out.println(aboutUsPageLink.isEnabled());
        aboutUsPageLink.click();
		*/
        WebElement createNewAccountLink = driver.findElement(By.linkText("Create New Account"));
        System.out.println(createNewAccountLink.isDisplayed());
        System.out.println(createNewAccountLink.isEnabled());
        createNewAccountLink.click();
        Thread.sleep(3000);


        driver.quit();



  }
}