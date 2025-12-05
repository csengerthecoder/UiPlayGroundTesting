package AllTests.Tests;

import AllTests.Base.BaseTest;
import Pages.ClassAttributePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassAttributePageTest extends BaseTest {

    @Test
    public void testClassAttributePage() {
        ClassAttributePage classAttributePage = mainPage.openClassAttributePage();
        boolean isCorrectButtonClicked = classAttributePage.ClickClassAttributeButton();
        Assertions.assertTrue(isCorrectButtonClicked);
    }
}
