package udm1;


import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ex01_Run {


    @Test
     public void test01() throws InterruptedException {

       Ex01 obj = new Ex01();

       //Way1(Non Return)
       //Put dot after "obj.launchBrowser1()" but no selenium option will be visible            
       obj.launchBrowser1();    


       /*
       //Way2(Return)
       //Put dot after "obj.launchBrowser2()" and selenium options will be visible
       //obj.launchBrowser2();
       */            

       //*******************************************************
       //Way1(Non Return)
       //obj.launchBrowser3("Chrome");
       //*******************************************************

       //Way1(Non Return)
       //obj.launchApp1();


       //Way2(Non Return)
       obj.launchApp2("https://parabank.parasoft.com/parabank/index.htm");

       
       /*
       //Way1(Non Return) - Not Allowed
       System.out.println(obj.pageTitle1());
       String expectedTitle1 = "ParaBank | Welcome | Online Banking";
       String actualTitle1 = obj.pageTitle1();
       assertEquals(actualTitle1, expectedTitle1);
       */        


       //Way2(Return)
       System.out.println(obj.pageTitle2());
       String expectedTitle2 = "ParaBank | Welcome | Online Banking";
       String actualTitle2 = obj.pageTitle2();
       assertEquals(actualTitle2, expectedTitle2);


       //************************************************

       /*
       //Use object with getTitle() method 
       System.out.println(obj.driver.getTitle());
       String expectedTitle3 = "ParaBank | Welcome | Online Banking";
       String actualTitle3 = obj.driver.getTitle();
       assertEquals(actualTitle3, expectedTitle3);
       */

       //OR

       /*
       //Use object.getDriver() with getTitle() method
       System.out.println(obj.getDriver().getTitle());
       String expectedTitle4 = "ParaBank | Welcome | Online Banking";
       String actualTitle4 = obj.getDriver().getTitle();
       assertEquals(actualTitle4, expectedTitle4);
       */        

       //********************************************

       //Way1(Non Return)
       obj.clickRegister1();

       //Way1(Non Return)
       //obj.clickRegister2("Register");

       /*
       //Way2(Return)
       WebElement reg = obj.clickRegister3();
       System.out.println(reg.isDisplayed());
       reg.click();
       */

       /*
       //OR Way2(Return)
       System.out.println(obj.clickRegister3().isDisplayed()); 
       obj.clickRegister3().click();
       */

       //Way1(Non Return)
       Thread.sleep(2000);
       obj.enterUsername();


       //Way2(Return)
       WebElement pw = obj.enterPassword();
       pw.sendKeys("demo");


       //Non Return
       obj.enterFirstname("david");

       //Non Return
       obj.enterLastname("customer.lastName", "hook");

       //Way1(Non Return)
       obj.footerText1();

       /*
       //Way2(Return)
       WebElement ftText1 = obj.footerText2();
       System.out.println(ftText1.getText());
       */


       /*
       //Way3(Return)
       //Put dot after "obj.footerText3()" and String options will be visible
       String ftText2 = obj.footerText3();
       System.out.println(ftText2);
       */
       //OR
       //System.out.println(obj.footerText3());


       //Way4(Return)
       //obj.footerText4();

       obj.clickAdminPage();

       Thread.sleep(2000);

       //Non Return
       obj.loanProviderDropdown1();

       //Non Return
       //obj.loanProviderDropdown2("JMS");

       
       //Return
       Select dd = obj.loanProviderDropdown3();
       dd.selectByVisibleText("JMS");
       

       Thread.sleep(2000);

       //Non Return
       obj.closeBrowser();
    }

}