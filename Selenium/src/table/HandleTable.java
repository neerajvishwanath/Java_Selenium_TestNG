package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleTable {
	 WebDriver driver;
	    String projectPath = System.getProperty("user.dir");
	    String chromeDriverPath = System.setProperty("webdriver.chrome.driver",projectPath + "\\drivers\\chromedriver.exe");
	    String url = "https://money.rediff.com/indices";


	    @Test
	    public void test01() throws Exception {
	 
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get(url);
	        Thread.sleep(2000);
	        
	        WebElement showMoreLess = driver.findElement(By.id("showMoreLess"));
	        showMoreLess.click();
	        
	        //Row Count
	        List<WebElement> rowCount = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr"));
	        System.out.println("Rows = " + rowCount.size());
	        
	        //Column Count
	        List<WebElement> columnCount = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]/td"));
	        System.out.println("Column = " + columnCount.size());
	        
	        System.out.println("****************************");

	        //Fetch data from a row
	        List<WebElement> rowData = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]/td"));
	        for (WebElement rd : rowData) {
				System.out.println(rd.getText());
			}
	        
	        System.out.println("****************************");

	        //Fetch data from a column
	        List<WebElement> columnData = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
	        for (WebElement cd : columnData) {
	        	System.out.println(cd.getText());
			}
	        
	        //Fetch all data from a table

	        Thread.sleep(2000);
	        for (WebElement rc : rowCount) {
				System.out.println(rc.getText());
			}
	        
	        driver.quit();
	    }
}
