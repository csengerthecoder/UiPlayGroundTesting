package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class ClassAttributePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By correctButton = By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]");

    public ClassAttributePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean ClickClassAttributeButton() {
        Objects.requireNonNull(wait.until(ExpectedConditions.elementToBeClickable(correctButton))).click();
        if (acceptAlert()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean acceptAlert() {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
            System.out.println("The alert has been shown");
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
