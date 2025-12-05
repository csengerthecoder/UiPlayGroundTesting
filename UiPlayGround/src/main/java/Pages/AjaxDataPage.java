package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxDataPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By pElement = By.className("bg-success");
    private final By dataButton = By.id("ajaxButton");

    public AjaxDataPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isPElementClicked() {
        wait.until(ExpectedConditions.elementToBeClickable(dataButton)).click();
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(pElement));
            System.out.println("pElement is clicked");
            return true;
        } catch (Exception e) {
            System.out.println("pElement is not clicked");
            return false;
        }
    }
}
