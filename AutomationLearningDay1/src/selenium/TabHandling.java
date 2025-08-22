package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*WebDriver driver=new ChromeDriver();
		String pw=driver.getWindowHandle();
		driver.get("https://www.changepond.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		String sw=driver.getWindowHandle();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().window(pw);
		//driver.navigate().back();*/
		//Task
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String pw=driver.getWindowHandle();
		driver.get("https://www.changepond.com/");
		driver.switchTo().newWindow(WindowType.TAB);
	
		String pw1=driver.getWindowHandle();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		String pw2=driver.getWindowHandle();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.switchTo().window(pw1);
		Thread.sleep(3000);
		
		driver.switchTo().window(pw2);
		Thread.sleep(3000);
		
		driver.switchTo().window(pw1);
		Thread.sleep(3000);
		
		driver.switchTo().window(pw);
		Thread.sleep(3000);
		
		driver.switchTo().window(pw2).close();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
