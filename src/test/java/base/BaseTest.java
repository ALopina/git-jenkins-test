package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resourses/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        driver.quit();

    }


}
