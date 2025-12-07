package AllTests.Tests;

import AllTests.Base.BaseTest;
import Pages.AjaxDataPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AjaxPageTest extends BaseTest {

    @Test
    public void AjaxDataButtonTest() {
        AjaxDataPage ajaxDataPage = mainPage.openAjaxDataPage();
        boolean isPElementClicked = ajaxDataPage.isPElementClicked();
        Assertions.assertTrue(isPElementClicked);
    }
}
