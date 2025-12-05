package AllTests.Tests;

import AllTests.Base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassAttributePageTest extends BaseTest {

    @Test
    public void testClassAttributePage() {
        mainPage.ClickClassAttributeButton();
        boolean isCorrectButtonClicked = classAttributePage.ClickClassAttributeButton();
        Assertions.assertTrue(isCorrectButtonClicked);
    }
}
