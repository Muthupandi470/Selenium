package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d =new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement button = d.findElement(By.xpath("//button[@onclick='alertbox()']"));
		button.click();
		
		Alert alert=d.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		alert.accept();
		
		WebElement button1=d.findElement(By.xpath("//a[text()='Alert with OK & Cancel']"));
		button1.click();
		
		WebElement button2=d.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		button2.click();
		Alert alert2=d.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert2.accept();

	}

}
