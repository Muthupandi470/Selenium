package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Right_clickandDouble_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver demo=new ChromeDriver();
		demo.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		WebElement user=demo.findElement(By.id("email"));
		Actions act=new Actions(demo);
		act.moveToElement(user).click().build().perform();
		act.contextClick(user).build().perform();
		user.sendKeys("Muthu");
		act.doubleClick(user).build().perform();
		
		

	}

}
