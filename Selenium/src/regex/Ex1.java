package regex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ex1 {
	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver",projectPath + "\\drivers\\chromedriver.exe");
    String url = "http://the-internet.herokuapp.com/hovers";


    @Test
    public void test01() throws Exception {
 
        driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        
        WebElement secondElement = driver.findElement(By.xpath("//div[@class='figure'][2]"));
        
        Actions action = new Actions(driver);
        action.moveToElement(secondElement).perform();
        
        String text = driver.findElement(By.xpath("//*[text()='name: user2']")).getText();
        if(text.matches("[A-Za-z0-9: ]{10}")){
        	System.out.println("true");
        }else{
        	System.out.println("false");
        }
        
        if(text.matches("[A-Za-z0-9: ]{11}")){
        	System.out.println("true");
        }else{
        	System.out.println("false");
        }
        driver.quit();
        
    }
}
