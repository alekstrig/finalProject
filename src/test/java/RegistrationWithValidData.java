import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

import pages.SignInPage;

public class RegistrationWithValidData extends BaseTest {

    @Test
    public void registrationValidData() throws InterruptedException {

        MainPage mainPage = new MainPage();
        //SignInPage signInPage = new SignInPage();
        //RegisterPage registerPage = new RegisterPage();

        String actualAccountName =
                mainPage.clickOnSignInButton()
                        .clickOnRegisterButton()
                        .selectGender()
                        .setFirstName("Clark")
                        .setLastName("Kent")
                        .setEmail("abc@abcc")
                        .setBirthday("07/09/1989")
                        .setPassword("12345")
                        .setCostumerPrivacy()
                        .setPrivacyPolicy()
                        .clickSubmitButton()
                        .getTextFromAccaunt();
        Assert.assertEquals(actualAccountName, "Clark Kent");

    }
}