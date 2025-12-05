package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class DynamicIdPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By dynamicIdButton = By.cssSelector(".btn.btn-primary");

    public DynamicIdPage(WebDriver driver,  WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean ClickTheButton() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(dynamicIdButton)).click();
            System.out.println("Button clicked succesfully");
            return true;
        } catch (Exception e) {
            System.out.println("Button click failed" + e.getMessage());
            return false;
        }
    }
}
