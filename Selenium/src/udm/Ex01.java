package udm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01 {
	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver",projectPath + "\\drivers\\chromedriver.exe");
    String url1 = "https://parabank.parasoft.com/parabank/index.htm";
 
    // Way1(Non Return)
    public void launchBrowser1(){
    	driver = new ChromeDriver();
    }
    
    // Way2(Return)
    public WebDriver launchBrowser2(){
    	driver = new ChromeDriver();
    	return driver;
    }
    
    // Way1(Non Return)
    public void launchApp1(){
    	driver.get(url1);
    }
    
    // Way2(Non Return)
    public void launchApp2(String url2){
    	driver.get(url2);
    }
    
    // Way1(Non Return)
    public void pageTitle1(){
    	driver.getTitle();
    }
    
    // Way2(Return)
    public String pageTitle2(){
    	return driver.getTitle();
    }
    
    // Way1(Non Return)
    public void clickRegister1(){
    	WebElement registerLink1 = driver.findElement(By.linkText("Register"));
    	registerLink1.click();
    }
    
    // Way2(Return)
    public WebElement clickRegister2(){
    	WebElement regsterLink2 = driver.findElement(By.linkText("Register"));
        return regsterLink2;
    }
    
    // Way1(Non Return)
    public void enterUsername(){
    	WebElement usernameTextbox = driver.findElement(By.name("username"));
    	usernameTextbox.sendKeys("john");
    }
    
    // Way2(Return)
    public WebElement enterPassword(){
    	WebElement passwordTextbox = driver.findElement(By.name("password"));
    	return passwordTextbox;
    }
    
    //Non Return
    public void enterFirstname(String fname){
    	WebElement firstnameTextbox = driver.findElement(By.name("customer.firstName"));
    	firstnameTextbox.sendKeys(fname);
    }
    
    //Non Return
    public void closeBrowser(){
    	driver.quit();
    }
    
    //Driver
    public WebDriver getDriver(){
    	return driver;
    }
    
}
