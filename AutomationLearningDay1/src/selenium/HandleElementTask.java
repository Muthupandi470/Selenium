package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleElementTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd=new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Register.html");
		
		wd.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Muthupandi");
		wd.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Selvaraj");
		wd.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Pudukottai");
		wd.findElement(By.xpath("//input[@type='email']")).sendKeys("Selvarajmuthupandi470@gmail.com");
        wd.findElement(By.xpath("//input[@type='tel']")).sendKeys("9360515906");
        wd.findElement(By.xpath("//input[@value='Male']")).click();
        
        wd.findElement(By.id("checkbox1")).click();
        wd.findElement(By.id("checkbox2")).click();
        wd.findElement(By.id("checkbox3")).click();
        
        wd.findElement(By.xpath("//div[@id='msdd']")).click();
		wd.findElement(By.xpath("//a[contains(text()  , \"English\")]")).click();
        
        Select s=new Select(wd.findElement(By.id("Skills")));
        s.selectByVisibleText("SQL");
        
        Select s1=new Select(wd.findElement(By.id("country")));
        s1.selectByVisibleText("India");
        
        Select d1=new Select(wd.findElement(By.id("yearbox")));
        d1.selectByValue("2001");
        
        Select d2=new Select(wd.findElement(By.xpath("//select[@placeholder='Month']")));
        d2.selectByVisibleText("July");
        
        Select d3=new Select(wd.findElement(By.id("daybox")));
        d3.selectByValue("9");
        
        
        wd.findElement(By.id("firstpassword")).sendKeys("Aakash@123");
        
        wd.findElement(By.id("secondpassword")).sendKeys("Aakash@456");
        
        wd.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\muthupandi.s\\Desktop\\1507\\Idly.jpg");
        
        
        
	}

}
