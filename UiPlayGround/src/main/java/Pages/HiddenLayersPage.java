package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class HiddenLayersPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By hiddenButton = By.cssSelector(".btn.btn-success");
    private final By correctButton = By.cssSelector(".btn.btn-primary");

    public HiddenLayersPage(WebDriver driver,  WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isCorrectButtonClicked() {
        Objects.requireNonNull(wait.until(ExpectedConditions.elementToBeClickable(hiddenButton))).click();
        try {
            Objects.requireNonNull(wait.until(ExpectedConditions.elementToBeClickable(correctButton))).click();
            System.out.println("The correct button has been clicked");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
