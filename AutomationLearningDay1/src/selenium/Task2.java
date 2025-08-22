package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*WebDriver wd=new ChromeDriver();
		wd.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement submit=wd.findElement(By.id("submit"));
		submit.click();
		
		WebElement error=wd.findElement(By.id("error"));
		System.out.println(error.getText());*/
		
		//How to Fetch an Error Message
		
		/*
		WebDriver d =new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement username=d.findElement(By.name("username"));
		username.click();
		WebElement login=d.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement Alert=d.findElement(By.xpath("//span[text()=Required']"));
		System.out.println();
		*/
		
		//How To Handle Scrollbar
		
		WebDriver d =new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		
		WebElement submit=d.findElement(By.id("submitbtn"));
		
		JavascriptExecutor JE = (JavascriptExecutor)d;
		JE.executeScript("arguments[0].scrollIntoView();",submit);
		//JE.executeScript("scroll(0,650)");
		Thread.sleep(3000);
		//JE.executeScript("scroll(0,-650");
		

	}

}
