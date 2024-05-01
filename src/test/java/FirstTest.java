import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    private WebDriver driver;
    private String path = "src/test/resources/chromedriver/chromedriver.exe";

    @BeforeTest()
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", this.path);
        this.driver = new ChromeDriver();
    }

    @Test()
    public void navigateToHomePage(){
        this.driver.get("https://ztrain-web.vercel.app/home");
//        this.driver.findElement(By.id("style_avatar_wrapper__pEGIQ")).click();
//        this.driver.findElement(By.id("email_login")).sendKeys("williammengo79@gmail.com");
//        this.driver.findElement(By.id("password_login")).click();
//        this.driver.findElement(By.id("password_login")).sendKeys("password");
//        this.driver.findElement(By.id("btn_login")).click();


    }

    /*@AfterTest()
    public void closeDriver(){
        this.driver.quit();
    }*/
}


