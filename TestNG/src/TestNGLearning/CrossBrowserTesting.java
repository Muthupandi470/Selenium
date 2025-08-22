package TestNGLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class CrossBrowserTesting {
	WebDriver driver;
  @Test
  @Parameters({"browser","user","pass"})
  public void Login(String browser,String user,String pass) throws Exception {
	  if( browser.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  WebElement user1name=driver.findElement(By.name("username"));
		  user1name.sendKeys(user);
		  
		  WebElement pass1word=driver.findElement(By.name("password"));
		  pass1word.sendKeys(pass);
		  
		  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		  login.click();
	  }
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  WebElement user1name=driver.findElement(By.name("username"));
		  user1name.sendKeys(user);
		  
		  WebElement pass1word=driver.findElement(By.name("password"));
		  pass1word.sendKeys(pass);
		  
		  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		  login.click();
	  }
	  else {
		  throw new Exception("browser invalid");
	  }
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
