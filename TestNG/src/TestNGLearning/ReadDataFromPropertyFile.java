package TestNGLearning;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {
  @Test
  public void f() throws Exception {
	  FileReader fr=new FileReader("D:\\TestNG\\src\\TestNGLearning\\Data.properties");
	  Properties p=new Properties();
	  p.load(fr);
	  WebDriver driver=new ChromeDriver();
	  driver.get(p.getProperty("url"));
	  Thread.sleep(5000);
	  WebElement Firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
      Firstname.sendKeys("Muthupandi");

      WebElement Lastname= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
      Lastname.sendKeys("Selvaraj");

      WebElement Address= driver.findElement(By.tagName("textarea"));
      Address.sendKeys("Pudukottai");

      WebElement Email= driver.findElement(By.xpath("//input[@type='email']"));
      Email.sendKeys("selvarajmuthupandi470@gmail.com");

      WebElement Phone= driver.findElement(By.xpath("//input[@type='tel']"));
      Phone.sendKeys("9360515906");

      Select s = new Select(driver.findElement(By.id("Skills")));
      s.selectByVisibleText("CSS");

      Select s1 = new Select(driver.findElement(By.id("yearbox")));
      s1.selectByVisibleText("2001");

      Select s2 = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
      s2.selectByVisibleText("July");

      Select s3 = new Select(driver.findElement(By.id("daybox")));
      s3.selectByVisibleText("9");

      WebElement Password= driver.findElement(By.id("firstpassword"));
      Password.sendKeys("Aakash@470");

      WebElement ConfirmPassword= driver.findElement(By.id("secondpassword"));
      ConfirmPassword.sendKeys("Muthu@470");
  }
	  //driver.get(p.getProperty("url1"));
	  //driver.get(p.getProperty("url2"));
  }

