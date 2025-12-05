package AllTests.Base;

import Pages.DynamicIdPage;
import Pages.MainPage;
import io.cucumber.core.cli.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected MainPage mainPage;
    protected DynamicIdPage dynamicIdPage;

    @BeforeEach
    public void setUp() {
        String gridUrl = System.getProperty("gridUrl");
        if (gridUrl != null && !gridUrl.isBlank()) {
            try {
                URL url = new URL(gridUrl);
                ChromeOptions options = new ChromeOptions();
                driver = new RemoteWebDriver(url, options);
            } catch (MalformedURLException e) {
                throw new RuntimeException("Invalid gridUrl: " + gridUrl, e);
            }
        } else {
            ChromeOptions options = new ChromeOptions();

            Map<String, Object> prefs = new HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--disable-save-password-bubble");
            options.addArguments("--disable-features=PasswordManagerOnboarding,PasswordLeakDetection");

            String osName = System.getProperty("os.name", "").toLowerCase();
            String ci = System.getenv("CI");

            if (osName.contains("linux") || (ci != null && ci.equalsIgnoreCase("true"))) {
                options.addArguments("--headless=new");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--window-size=1920,1080");
            }

            driver = new ChromeDriver(options);
        }

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        mainPage = new MainPage(driver, wait);
        dynamicIdPage = new DynamicIdPage(driver, wait);

        driver.get("http://uitestingplayground.com/home");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}