package AllTests.Tests;

import AllTests.Base.BaseTest;
import Pages.HiddenLayersPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HiddenLayersPageTest extends BaseTest {

    @Test
    void hiddenButtonClickTest() {
        HiddenLayersPage hiddenLayersPage = mainPage.openHiddenLayersPage();
        boolean isCorrectButtonClicked = hiddenLayersPage.isCorrectButtonClicked();
        Assertions.assertTrue(isCorrectButtonClicked);
    }
}
