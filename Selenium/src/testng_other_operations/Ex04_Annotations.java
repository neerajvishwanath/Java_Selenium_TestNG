package testng_other_operations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
 
public class Ex04_Annotations {
 

      @BeforeSuite
      public void beforeSuite() {
          System.out.println("Setup browser property");
      }
 

      @BeforeTest
      public void beforeTest() {
          System.out.println("Launch browser");
      }
 
      
      @BeforeClass
      public void beforeClass() {
          System.out.println("Launch app");
      }
 
      @BeforeMethod
      public void beforeMethod() {
          System.out.println("Login");
      }
 
      @Test
      public void test01() {
          System.out.println("Click First Link");
      }

      @Test
      public void test02() {
          System.out.println("Click Second Link");
      }
 
      @AfterMethod
      public void afterMethod() {
          System.out.println("Logout");
      }
 
      @AfterClass
      public void afterClass() {
          System.out.println("Delete cookies");
      }

      @AfterTest
      public void afterTest() {
          System.out.println("Close browser");  
      }
 

      @AfterSuite
      public void afterSuite() {
          System.out.println("Generate report");
      }
 
}
