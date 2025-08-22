package TestNGLearning;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTask1 {
  @Test(dataProvider = "dp")
  public void f(String A, String B) {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testtrack.org/login-demo");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement username=driver.findElement(By.id("username"));
	  username.sendKeys(A);
	  
	  WebElement password=driver.findElement(By.id("password"));
	  password.sendKeys(B);
	  
	  WebElement login=driver.findElement(By.id("login-submit"));
	  login.click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "testuser", "password123" },
      new Object[] { "Muthu", "password456" },
    };
  }
}
