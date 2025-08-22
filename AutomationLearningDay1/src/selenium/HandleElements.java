package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		d.manage().window().maximize();
		d.findElement(By.id("idToken1")).sendKeys("Muthupandi S");
		d.findElement(By.id("idToken2")).sendKeys("Aakash@4742");
		d.findElement(By.className("checkmark")).click();
		d.findElement(By.partialLinkText(""));
		

	}

}
