package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Static.html");
		d.manage().window().maximize();
		Actions action=new Actions(d);
		
		 WebElement drop = d.findElement(By.id("droparea"));
		
		WebElement drag=d.findElement(By.id("angular"));
		action.dragAndDrop(drag, drop).build().perform();
		
		WebElement drag2=d.findElement(By.id("mongo"));
		action.dragAndDrop(drag2, drop).build().perform();
		
		WebElement drag3=d.findElement(By.id("node"));				
		action.dragAndDrop(drag3, drop).build().perform();
		*/
		
		//Task 
		
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/drag_drop.html");
		d.manage().window().maximize();
		Actions action=new Actions(d);
		
		WebElement drag1=d.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement drop1 = d.findElement(By.id("bank"));
		action.dragAndDrop(drag1, drop1).build().perform();
		
		WebElement drag2=d.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement drop2 = d.findElement(By.id("amt8"));
		action.dragAndDrop(drag2, drop2).build().perform();
		
		
		

	}

}
