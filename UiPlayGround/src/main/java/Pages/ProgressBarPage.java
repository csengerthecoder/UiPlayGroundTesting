package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By progressBar = By.id("progressBar");
    private final By startButton = By.id("startButton");
    private final By stopButton = By.id("stopButton");

    public ProgressBarPage(WebDriver driver,  WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void startTheProgressBar() {
        wait.until(ExpectedConditions.elementToBeClickable(startButton)).click();
    }

    public boolean isProgressBarStoppedCorrectly() {
        try {
            wait.until(driver -> {
                String attr = driver.findElement(progressBar).getAttribute("aria-valuenow");
                int value = Integer.parseInt(attr);
                return value >= 75;
            });
            driver.findElement(stopButton).click();

            String finalAttr = driver.findElement(progressBar).getAttribute("aria-valuenow");
            int finalValue = Integer.parseInt(finalAttr);
            System.out.println("Final value: " + finalValue);

            return finalValue >= 75 && finalValue <= 85;
        } catch (Exception e) {
            return false;
        }
    }
}
