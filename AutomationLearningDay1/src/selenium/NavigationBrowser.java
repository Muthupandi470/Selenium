package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://mail.google.com/");
		dr.navigate().to("https://www.changepond.com/");		
		Thread.sleep(10000);
		
		dr.navigate().back();
		Thread.sleep(10000);
		
		dr.navigate().forward();
		dr.navigate().refresh();
		
		//to get the size of Webpage
		System.out.println(dr.manage().window().getSize());
		
	}

}
