package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    	
		WebDriver wd1 = new FirefoxDriver();//Open Chromebrowser
		wd1.manage().window().maximize();
		String url="https://mail.google.com/mail";
		wd1.get(url);
		wd1.manage().window().minimize();
		String title = wd1.getTitle();
		if(title.equals("Welcome")) {
			System.out.println("PAss");
		}else {
			System.out.println("Fail");
		}
		System.out.println(wd1.getCurrentUrl());
		Thread.sleep(10000);
		wd1.close();
		
	

	}

}
