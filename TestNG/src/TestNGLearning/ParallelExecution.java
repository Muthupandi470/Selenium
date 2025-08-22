package TestNGLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver driver;
  @Test(priority=0)
  public void LoginChrome() {
	  driver=new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("Admin");
	  
	  
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
  @Test(priority=2)
  public void LoginFirefox() {
	  driver=new FirefoxDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("Admin");
	  
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  
	  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
  @Test(priority=1)
  public void LoginEdge() {
	  driver=new EdgeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("Admin");
	  
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  
	  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
}
