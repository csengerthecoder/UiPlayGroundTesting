package AllTests.Tests;

import AllTests.Base.BaseTest;
import Pages.ScrollBarPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScrollBarPageTest extends BaseTest {

    @Test
    void scrollBarsTest() {
        ScrollBarPage scrollBarPage = mainPage.openScrollBarPage();
        boolean isButtonCLicked = scrollBarPage.scrollToButton();
        Assertions.assertTrue(isButtonCLicked);
    }
}
