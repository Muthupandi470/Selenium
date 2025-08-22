package TestNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG1 {
  @Test
  public void login() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  Thread.sleep(3000);
	  WebElement Username=driver.findElement(By.name("username"));
	  Username.sendKeys("Admin");
	  
	  Thread.sleep(3000);
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  Thread.sleep(3000);
	  
	  WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	  loginbutton.click();
	  Thread.sleep(3000);
	  
	  System.out.println(driver.getTitle());
	 
	  
	  
  }
  
}
