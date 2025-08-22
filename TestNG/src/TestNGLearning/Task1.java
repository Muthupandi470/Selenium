package TestNGLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Task1 {
	WebDriver Driver;
  @Test(priority=1)
  public void Valid() throws InterruptedException {
	  
	  WebElement Username=Driver.findElement(By.name("username"));
	  Username.sendKeys("Admin");
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement password=Driver.findElement(By.name("password"));
	  password.sendKeys("admin123");	
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement loginbutton=Driver.findElement(By.xpath("//button[@type='submit']"));
	  loginbutton.click();
	  Driver.navigate().back();
  }
  @Test(priority=2)
  public void InValid() throws InterruptedException {
	
	  WebElement Username=Driver.findElement(By.name("username"));
	  Username.sendKeys("Ad");
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement password=Driver.findElement(By.name("password"));
	  password.sendKeys("admin");	
	  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement loginbutton=Driver.findElement(By.xpath("//button[@type='submit']"));
	  loginbutton.click();
  }
  @BeforeTest
  public void beforeTest1() {
	  Driver=new ChromeDriver();
	  Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest1() {
	  Driver.close();
  }

}
