import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import pages.RegisterPage;

public class RegistrationWithInvalidData extends BaseTest {

    @Test
    public void registrationValidData() throws InterruptedException {

        MainPage mainPage = new MainPage();
        //SignInPage signInPage = new SignInPage();
        RegisterPage registerPage = new RegisterPage();

        String actualBorderColor =
                mainPage.clickOnSignInButton()
                        .clickOnRegisterButton()
                        .selectGender()
                        .setFirstName("James8")
                        .setLastName("Kent")
                        .setEmail("abc@abcc")
                        .setPassword("12345")
                        .setBirthday("07/09/1989")
                        .setCostumerPrivacy()
                        .setPrivacyPolicy()
                        .clickOnSignInButtonWithInvalid()
                        .checkColorOfBorder();
        String actualInvalidFormat =
                registerPage.checkInvalidFormat();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualBorderColor,"rgba(255, 76, 76, 1)");
        softAssert.assertEquals(actualInvalidFormat,"Invalid format.");
        softAssert.assertAll();

    }
}