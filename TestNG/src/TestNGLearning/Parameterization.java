package TestNGLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Parameterization {
	WebDriver Driver;
  @Test
  @Parameters({"Admin","admin123"})
  public void logindemo(String Admin,String admin123 ) {
	  
	  WebElement username=Driver.findElement(By.id("email"));
	  username.sendKeys(Admin);
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement password=Driver.findElement(By.name("password"));
	  password.sendKeys(admin123);
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement loginbutton=Driver.findElement(By.xpath("//input[@value='Login']"));
	  loginbutton.click();
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Driver.navigate().back();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  Driver = new ChromeDriver();
	  Driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
	  Driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  Driver.close();
  }

}
