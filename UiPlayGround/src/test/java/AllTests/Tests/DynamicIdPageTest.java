package AllTests.Tests;

import AllTests.Base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicIdPageTest extends BaseTest {

    @Test
    void DynamicIdButtonTest() {
        mainPage.ClickDynamicButtonTaskButton();
        boolean isClickHappened = dynamicIdPage.ClickTheButton();
        Assertions.assertTrue(isClickHappened);
    }
}
