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
    private final By classAttributeButton = By.linkText("Class Attribute");
    private final By hiddenLayersButton = By.linkText("Hidden Layers");
    private final By loadDelayButton = By.linkText("Load Delay");
    private final By ajaxDataButton = By.linkText("AJAX Data");
    private final By scrollBars = By.linkText("Scrollbars");

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private void click(By locator) {
        Objects.requireNonNull(wait.until(ExpectedConditions.elementToBeClickable(locator))).click();
    }

    public HiddenLayersPage openHiddenLayersPage() {
        click(hiddenLayersButton);
        return new HiddenLayersPage(driver, wait);
    }
    public ClassAttributePage openClassAttributePage() {
        click(classAttributeButton);
        return new ClassAttributePage(driver, wait);
    }
    public DynamicIdPage openDynamicIdPage() {
        click(dynamicButtonTaskButton);
        return new DynamicIdPage(driver, wait);
    }
    public LoadDelayPage openLoadDelayPage() {
        click(loadDelayButton);
        return new LoadDelayPage(driver, wait);
    }
    public AjaxDataPage openAjaxDataPage() {
        click(ajaxDataButton);
        return new AjaxDataPage(driver, wait);
    }
    public ScrollBarPage openScrollBarPage() {
        click(scrollBars);
        return new ScrollBarPage(driver, wait);
    }
}
