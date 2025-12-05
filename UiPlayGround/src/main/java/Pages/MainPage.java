package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By dynamicButtonTaskButton = By.linkText("Dynamic ID");

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void ClickDynamicButtonTaskButton() {
        Objects.requireNonNull(wait.until(ExpectedConditions.elementToBeClickable(dynamicButtonTaskButton))).click();
    }
}
