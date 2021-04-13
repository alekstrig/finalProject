import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class SubscribeWithInvalidEmail extends BaseTest {

    @Test
    public void enterInvalidEmail() throws InterruptedException {

        MainPage mainPage = new MainPage();



       boolean myActualEmail =
            mainPage.enterEmailField("777")
            .clickOnSubScribeButton()
            .checkInvalidEmail();

        Assert.assertEquals(myActualEmail, false);





    }


}
