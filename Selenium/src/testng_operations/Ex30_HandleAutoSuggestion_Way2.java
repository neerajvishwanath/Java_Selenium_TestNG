package testng_operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex30_HandleAutoSuggestion_Way2 {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "https://www.google.com/";

	@Test
	public void test01() throws InterruptedException {
		
		driver = new ChromeDriver();
	    driver.get(url);

	    Thread.sleep(1000);
	    
	    WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("automation");

        Thread.sleep(2000);
	    
      //List<WebElement> elements = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));

        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='sbct']"));

        Thread.sleep(2000);
        int elementCount = elements.size();
        System.out.println(elementCount);

      //Approach 1
//        elements.get(5).click();
	    
        
      //Approach 2
        /*
        for (WebElement element : elements) {
                 System.out.println(element.getText());
               if (element.getText().equalsIgnoreCase("automation tools")) {
                   element.click();
                   break;
               }
        }
        */
        
        //Approach 3
        /*
        for(int i=0; i<elementCount; i++) {
            System.out.println(elements.get(i).getText());
               if (elements.get(i).getText().contains("automation tools")) {
                   elements.get(i).click();
                   break;
               }
        }
        */
        
	    
	    Thread.sleep(5000);
	    
	    driver.quit();
	}	
}
