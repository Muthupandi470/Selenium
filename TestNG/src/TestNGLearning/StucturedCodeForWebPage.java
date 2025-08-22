package TestNGLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class StucturedCodeForWebPage {
	WebDriver driver;
  @Test
  public void login() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement Username=driver.findElement(By.name("username"));
	  Username.sendKeys("Admin");
	  Thread.sleep(3000);
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("admin123");	
	  Thread.sleep(3000);
	  WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	  loginbutton.click();
  }
  @BeforeTest
  public void BrowserSetup() {
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void tearDemo() {
	  driver.close();
	  
  }

}
