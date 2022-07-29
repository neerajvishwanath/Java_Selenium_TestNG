package testng_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Ex23_2_HandleAlert {
	 WebDriver driver;
	    String projectPath = System.getProperty("user.dir");
	    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	    String url = "https://www.yatra.com/";
	 
	    @Test
	    public void test01() throws InterruptedException {
	 
	        //Notification Alert
	    	ChromeOptions opt = new ChromeOptions();
	    	opt.addArguments("--disable-notifications");
	    	opt.addArguments("--disable-infobars");
	    	
	    	driver = new ChromeDriver(opt);
	    	driver.get(url);
	    	
	    	Thread.sleep(5000);
	    	
	    	driver.quit();
	    	
	    	
	    	
     }
}
