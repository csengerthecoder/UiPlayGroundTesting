package AllTests.Base;

import Pages.DynamicIdPage;
import Pages.MainPage;
import io.cucumber.core.cli.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected MainPage mainPage;
    protected DynamicIdPage dynamicIdPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        mainPage = new MainPage(driver, wait);
        dynamicIdPage = new DynamicIdPage(driver, wait);

        ChromeOptions options = new ChromeOptions();
        String osName = System.getProperty("os.name", "").toLowerCase();
        String ci = System.getenv("CI");

        if (osName.contains("linux") || (ci != null && ci.equalsIgnoreCase("true"))) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--window-size=1920,1080");
        }
        driver.get("http://uitestingplayground.com/home");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}