package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCustomeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://accounts.saucelabs.com/am/XUI/#login/");
		Dimension d1=new Dimension(500,700);
		d.manage().window().setSize(d1);

	}

}
