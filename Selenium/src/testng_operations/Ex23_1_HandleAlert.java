package testng_operations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Ex23_1_HandleAlert {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "http://the-internet.herokuapp.com/javascript_alerts";
	
	@Test
	public void test01() throws Exception{
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement alertElement = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		alertElement.click();
		
		Thread.sleep(3000);
		
//		//Print the alert text
//        System.out.println(driver.switchTo().alert().getText());
//        Thread.sleep(1000);
//        
//        //Enter text in alert text box
//        driver.switchTo().alert().sendKeys("Hello Alert");
//        
//        Thread.sleep(2000);
//        
//        //Click Alert OK button
//        driver.switchTo().alert().accept();
//
//        Thread.sleep(1000);
//        
//        //Open the alert again
//        alert.click();
//
//        Thread.sleep(1000);
//
//        //Click Alert Cancel button
//        driver.switchTo().alert().dismiss();
//        
//        Thread.sleep(2000);
        
		Alert alert = driver.switchTo().alert();

        //Print the alert text
        System.out.println(alert.getText());

        Thread.sleep(1000);

        //Enter text in alert text box
        alert.sendKeys("Hello Alert");

        Thread.sleep(1000);

        //Click Alert OK button
        alert.accept();

        Thread.sleep(1000);

        //Open the alert again
        alertElement.click();

        Thread.sleep(1000);

        //Click Alert Cancel button
        alert.dismiss();

        Thread.sleep(2000);
		driver.quit();
	}
}
