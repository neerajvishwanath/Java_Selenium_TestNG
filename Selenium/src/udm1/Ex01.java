package udm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
 

public class Ex01 {
 
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver",projectPath + "\\drivers\\chromedriver.exe");
    String firefoxDriverPath = System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver.exe");
    String url1 = "https://parabank.parasoft.com/parabank/index.htm";
 
    // Way1(Non Return)
    public void launchBrowser1() {
        driver = new ChromeDriver();
    }
 
    // Way2(Return)
    public WebDriver launchBrowser2() {
 
        driver = new ChromeDriver();
        return driver;
    }
 
    // ********************************************************
    // Way1(Non Return)
    public void launchBrowser3(String browser) {
        if (browser.equalsIgnoreCase("Chrome"))
            driver = new ChromeDriver();
        else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } 
        else if (browser.equalsIgnoreCase("Headless")) {
            driver = new HtmlUnitDriver();
        }
        else {
            System.out.println("Browser is not applicable");
        }
    }
 
    // *********************************************************
 
    // Way1(Non Return)
    public void launchApp1() {
 
        driver.get(url1);
 
    }
 
    // Way2(Non Return)
    public void launchApp2(String url2) {
 
        driver.get(url2);
 
    }
 
    /*
    // Way1(Non Return)
    public void pageTitle1() {
        driver.getTitle();
    }
    */

    // Way2(Return)
    public String pageTitle2() {
        return driver.getTitle();
    }
 
    // Way1(Non Return)
    public void clickRegister1() {
        WebElement regsterLink1 = driver.findElement(By.linkText("Register"));
        regsterLink1.click();
    }
 
    // Way1(Non Return)
    public void clickRegister2(String linkLocator) {
        WebElement regsterLink2 = driver.findElement(By.linkText(linkLocator));
        regsterLink2.click();
        }
 
    // Way2(Return)
    public WebElement clickRegister3() {
        WebElement regsterLink3 = driver.findElement(By.linkText("Register"));
        return regsterLink3;
    }
 
    // Way1(Non Return)
    public void enterUsername() {
        WebElement usernameTextbox = driver.findElement(By.name("username"));
        usernameTextbox.sendKeys("john");
    }
 
    // Way2(Return)
    public WebElement enterPassword() {
        WebElement passwordTextbox = driver.findElement(By.name("password"));
        return passwordTextbox;
    }
 
    // Non Return
    public void enterFirstname(String fname) {
        WebElement firstnameTextbox = driver.findElement(By.name("customer.firstName"));
        firstnameTextbox.sendKeys(fname);
    }

    // Non Return
    public void enterLastname(String nameLocator, String lname) {
        WebElement firstnameTextbox = driver.findElement(By.name(nameLocator));
        firstnameTextbox.sendKeys(lname);
        }
 
    // Way1(Non Return)
    public void footerText1() {
        WebElement footerElement1 = driver.findElement(By.className("copyright"));
        String text1 = footerElement1.getText();
        System.out.println(text1);
    }
 
    // Way2(Return)
    public WebElement footerText2() {
        WebElement footerElement2 = driver.findElement(By.className("copyright"));
        return footerElement2;
    }
 
    // Way3(Return)
    public String footerText3() {
        WebElement footerElement3 = driver.findElement(By.className("copyright"));
        String text2 = footerElement3.getText();
        return text2;
    }
 
    // Way4(Return)
    public WebElement footerText4() {
        WebElement footerElement4 = driver.findElement(By.className("copyright"));
        String text3 = footerElement4.getText();
        System.out.println(text3);
        return footerElement4;
    }
 
    // Admin Page Link
    public void clickAdminPage() {
        WebElement adminPage = driver.findElement(By.linkText("Admin Page"));
        adminPage.click();
    }
 
    // Way1(Non Return)
    public void loanProviderDropdown1() {
        WebElement dropdownElement1 = driver.findElement(By.id("loanProvider"));
        Select dropdown1 = new Select(dropdownElement1);
        dropdown1.selectByVisibleText("JMS");
    }
 
    // Way1(Non Return)
    public void loanProviderDropdown2(String option) {
        WebElement dropdownElement2 = driver.findElement(By.id("loanProvider"));
        Select dropdown2 = new Select(dropdownElement2);
        dropdown2.selectByVisibleText(option);
    }
 
    // Way2(Return)
    public Select loanProviderDropdown3() {
        WebElement dropdownElement3 = driver.findElement(By.id("loanProvider"));
        Select dropdown3 = new Select(dropdownElement3);
        return dropdown3;
    }
 
    // Non Return
    public void closeBrowser() {
        driver.quit();
    }
 
    // Driver
    public WebDriver getDriver() {
        return driver;
    }
 
}