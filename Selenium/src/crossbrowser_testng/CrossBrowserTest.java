package crossbrowser_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String url = "https://parabank.parasoft.com/parabank/index.htm";
    @Test
    @Parameters("browser")
    public void test(String browser) throws InterruptedException{
    	
    	 if(browser.equalsIgnoreCase("Chrome")){
    		 System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
             driver = new ChromeDriver();
             driver.get(url);
             System.out.println(driver.getTitle());
             Thread.sleep(1000);
             driver.quit();
         }

         else if(browser.equalsIgnoreCase("Firefox")){    
             System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver.exe");
             driver = new FirefoxDriver();
             driver.get(url);
             System.out.println(driver.getTitle());
             Thread.sleep(1000);
             driver.quit();
         }

         else if(browser.equalsIgnoreCase("Headless")){    
             driver = new HtmlUnitDriver();
             driver.get(url);
             System.out.println(driver.getTitle());
             Thread.sleep(1000);
             driver.quit();
         }else{
             System.out.println("Browser is not applicable");
         }
    }
}
