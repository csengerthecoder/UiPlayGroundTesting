package AllTests.Tests;

import AllTests.Base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HiddenLayersPageTest extends BaseTest {

    @Test
    void hiddenButtonCLickTest() {
        mainPage.ClickHiddenLayersButton();
        boolean isCorrectButtonClicked = hiddenLayersPage.isCorrectButtonClicked();
        Assertions.assertTrue(isCorrectButtonClicked);
    }
}
