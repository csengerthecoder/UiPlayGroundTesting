package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class LoadDelayPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By delayedButton = By.cssSelector(".btn.btn-primary");

    public LoadDelayPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isDelayedButtonClicked() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(delayedButton)).click();
            System.out.println("delayed button successfully clicked");
            return true;
        } catch(Exception e) {
            System.out.println("delayed button clicking is failed");
            return false;
        }
    }
}
