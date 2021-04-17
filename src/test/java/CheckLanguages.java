import org.testng.annotations.Test;
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

        /*SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(sumOfLanguages, 44);

       softAssert.assertAll();*/
        assertThat(uk).containsSequence("Українська");
        assertThat(sumOfLanguages).isEqualTo(44);



    }
}

