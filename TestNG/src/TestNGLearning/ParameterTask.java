package TestNGLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class ParameterTask {
    WebDriver wd;

    @Test
    @Parameters({"Firstname","Lastname","Address","Email","Phone","Skills","yearbox","Month","daybox","Password","ConfirmPassword"})
    public void f(String Firstname1, String Lastname1, String Address1, String Email1, String Phone1, String Skills1, String yearbox1, String Month1, String daybox1, String Password1, String ConfirmPassword1) {
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set once!

        WebElement Firstname = wd.findElement(By.xpath("//input[@placeholder='First Name']"));
        Firstname.sendKeys(Firstname1);

        WebElement Lastname= wd.findElement(By.xpath("//input[@placeholder='Last Name']"));
        Lastname.sendKeys(Lastname1);

        WebElement Address= wd.findElement(By.tagName("textarea"));
        Address.sendKeys(Address1);

        WebElement Email= wd.findElement(By.xpath("//input[@type='email']"));
        Email.sendKeys(Email1);

        WebElement Phone= wd.findElement(By.xpath("//input[@type='tel']"));
        Phone.sendKeys(Phone1);

        Select s = new Select(wd.findElement(By.id("Skills")));
        s.selectByVisibleText(Skills1);

        Select s1 = new Select(wd.findElement(By.id("yearbox")));
        s1.selectByVisibleText(yearbox1);

        Select s2 = new Select(wd.findElement(By.xpath("//select[@placeholder='Month']")));
        s2.selectByVisibleText(Month1);

        Select s3 = new Select(wd.findElement(By.id("daybox")));
        s3.selectByVisibleText(daybox1);

        WebElement Password= wd.findElement(By.id("firstpassword"));
        Password.sendKeys(Password1);

        WebElement ConfirmPassword= wd.findElement(By.id("secondpassword"));
        ConfirmPassword.sendKeys(ConfirmPassword1);
    }

    @BeforeTest
    public void beforeTest() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set once here
        // Use the correct URL which matches your element locators!
        wd.get("https://demo.automationtesting.in/Register.html");
        wd.manage().window().maximize();
    }

    @AfterTest
    public void afterTest() {
        wd.quit();
    }
}
