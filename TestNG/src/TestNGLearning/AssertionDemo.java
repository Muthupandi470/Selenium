package TestNGLearning;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  SoftAssert sa=new SoftAssert();
	  String expTitle=driver.getTitle();
	  String actTitle="Google";
	  sa.assertEquals(expTitle, actTitle);
	  System.out.println("Test is Completed");
	  sa.assertAll();
  }
}
