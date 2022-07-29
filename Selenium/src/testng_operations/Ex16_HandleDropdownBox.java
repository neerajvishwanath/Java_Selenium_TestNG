package testng_operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ex16_HandleDropdownBox {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "https://www.facebook.com/";
	
	@Test
	public void test01() throws Exception {
		driver = new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(3000);
		
		WebElement createAccount = driver.findElement(By.linkText("Create New Account"));
		createAccount.click();
		
		Thread.sleep(3000);
		
		WebElement dropdownElement = driver.findElement(By.id("day"));
		Select dropdown = new Select(dropdownElement);
		
		//find default selected dropdown value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		
		//Select the value in By .selectByVisibleText dropdown
		dropdown.selectByVisibleText("13");
		
		Thread.sleep(2000);
		//Select the value in By .selectByValue dropdown
		dropdown.selectByValue("7");
		
		Thread.sleep(2000);
		
		//Select the value in By .selectByIndex dropdown
		dropdown.selectByIndex(9);
		
		WebElement value = driver.findElement(By.xpath("//*[@id='month']"));
		System.out.println("Is element selected --> " + value.isSelected());
        System.out.println("Text of value is --> " + value.getText());
        
        
        // Dropdown items count
        List<WebElement> count = dropdown.getOptions();
        int itemscount = count.size();
        System.out.println(itemscount);
        
        // Dropdown items print
        for (int i = 0; i < itemscount; i++) {
            System.out.println(count.get(i).getText());
        }
        
        /*
        // OR 
        for (WebElement option : count)
        { 
        System.out.println(option.getText());
        }
        */
 
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
	}
}
