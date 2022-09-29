package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {

    public WebDriver Driver;

    @Before
    public void initiateDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");

        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        Driver=new ChromeDriver(chromeOptions);
        Driver.get("https://the-internet.herokuapp.com/");
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    public WebDriver getDriver() {
        return Driver;
    }

   /* @After
    public void cleaner(){
        Driver.quit();
    }*/
}
