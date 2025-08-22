package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver wd = new FirefoxDriver();// Open Firfoxbrowser
		String s = "https://www.google.com";
		
		WebDriver wd = new ChromeDriver();//Open Chromebrowser
		wd.get(s);//open webpage	
		
		wd.manage().window().maximize();//to maximize the webpage		
		//Thread.sleep(10000);		
        wd.manage().window().minimize();//to minimize the webpage   
        System.out.println(wd.getTitle());//to get title
        System.out.println(wd.getCurrentUrl());//to get Current URL
        System.out.println(wd.getPageSource());
        
        
        
	}

}
 