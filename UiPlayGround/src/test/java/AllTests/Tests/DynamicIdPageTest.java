package AllTests.Tests;

import AllTests.Base.BaseTest;
import Pages.DynamicIdPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicIdPageTest extends BaseTest {

    @Test
    void dynamicIdButtonTest() {
        DynamicIdPage dynamicIdPage = mainPage.openDynamicIdPage();
        boolean isClickHappened = dynamicIdPage.ClickTheButton();
        Assertions.assertTrue(isClickHappened);
    }
}
