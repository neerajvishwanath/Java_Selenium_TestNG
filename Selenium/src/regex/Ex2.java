package regex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex2 {
	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver",projectPath + "\\drivers\\chromedriver.exe");
    String url = "http://automationpractice.com/index.php";


    @Test
    public void test01() throws Exception {
 
        driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        Thread.sleep(3000);
        
        WebElement email = driver.findElement(By.linkText("support@seleniumframework.com"));
        js.executeScript("arguments[0].scrollIntoView(true);", email);
        
        Thread.sleep(3000);
        
        String emailText = email.getText();
        System.out.println(emailText);
        
        if(emailText.matches("[A-Za-z0-9-]+@[a-z]+\\.[a-z]{2,4}")){
        	System.out.println("True");
        }else{
        	System.out.println("False");
        }
        Thread.sleep(3000);
        
        driver.quit();
        
        
    }
}
