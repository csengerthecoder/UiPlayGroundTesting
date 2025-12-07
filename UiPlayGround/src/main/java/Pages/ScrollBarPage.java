package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollBarPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By hiddenButton = By.cssSelector(".btn.btn-primary");
    private final By scrollBarDiv = By.cssSelector("div[style*='overflow-y: scroll']");

    public ScrollBarPage(WebDriver driver,  WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean scrollToButton() {
        WebElement button =  driver.findElement(hiddenButton);

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center', inline: 'center'});",
                button
        );

        try {
            wait.until(ExpectedConditions.elementToBeClickable(button)).click();
            System.out.println("button successfully clicked");
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
