package AllTests.Tests;

import AllTests.Base.BaseTest;
import Pages.ProgressBarPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgressBarPageTest extends BaseTest {

    @Test
    void testProgressBarPage() {
        ProgressBarPage progressBarPage = mainPage.openProgressBarPage();
        progressBarPage.startTheProgressBar();
        boolean isProgressIsCorrect = progressBarPage.isProgressBarStoppedCorrectly();
        Assertions.assertTrue(isProgressIsCorrect);
    }
}
