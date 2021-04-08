import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscribeWithInvalidEmail extends BaseTest {

    @Test
    public void enterInvalidEmail() {

        MainPage mainPage = new MainPage();

        String myActualEmailText =
            mainPage.enterEmailField("ttt@ttt")
                .clickOnSubScribeButton()
                .checkInvalidEmail();

        Assert.assertEquals(myActualEmailText, "You have successfully subscribed to this newsletter.");





    }


}
