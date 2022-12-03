package MySteps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Initialization
 */
public abstract class AbstractStepDefs {

    private static final int WAIT_TIME = 10;

    static WebDriver driver;

    protected static HomePage homePage;

    static {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

}
