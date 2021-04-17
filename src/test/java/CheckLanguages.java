import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class CheckLanguages extends BaseTest {

    @Test

    public void checkLanguages() {



        MainPage mainPage = new MainPage();

        int sumOfLanguages = mainPage.getListOfLanguages()
                .size();
        List<String> uk = mainPage.clickOnDropDownLanguages()
                .getListOfLanguages();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(sumOfLanguages, 44);
        assertThat(uk).containsSequence("Українська");

       softAssert.assertAll();


    }
}

