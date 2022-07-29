package testng_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class Ex25_HandleCalendar {
 
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://www.yatra.com/";
 
    @Test
    public void test01() throws InterruptedException {
 
        driver = new ChromeDriver();
        driver.get(url);
 
        Thread.sleep(2000);
        
        WebElement depCal = driver.findElement(By.id("BE_flight_origin_date"));
        depCal.click();
        
        Thread.sleep(2000);

        WebElement depDate = driver.findElement(By.id("19/02/2022"));
        depDate.click();

        Thread.sleep(2000);
        
        WebElement retCal = driver.findElement(By.id("BE_flight_arrival_date"));
        retCal.click();

        Thread.sleep(2000);

        WebElement retDate = driver.findElement(By.id("20/02/2022"));        
        retDate.click();

        Thread.sleep(2000);

        driver.quit();



}
}