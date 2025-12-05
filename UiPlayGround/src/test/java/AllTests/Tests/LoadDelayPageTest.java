package AllTests.Tests;

import AllTests.Base.BaseTest;
import Pages.LoadDelayPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoadDelayPageTest extends BaseTest {

    @Test
    public void loadDelayedButtonClickTest() {
        LoadDelayPage loadDelayPage = mainPage.openLoadDelayPage();
        boolean isDelayedButtonClicked = loadDelayPage.isDelayedButtonClicked();
        Assertions.assertTrue(isDelayedButtonClicked);
    }
}
