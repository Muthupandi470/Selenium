package TestNGLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("I am from TestCase");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am from BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am from BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am from AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am from BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am from AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am from BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am from AfterSuite");
  }

}
