package TestNGLearning;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderLearning {
  @Test(dataProvider = "dp")
  public void Login(String A, String B) {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys(A);
	  
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys(B);
	  
	  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Muthu", "muthu123" },
      new Object[] { "Adman", "admin456" },
      new Object[] { "Admen", "admin675" },
    };
  }
}
