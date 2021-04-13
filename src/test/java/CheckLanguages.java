import bloks.ListOfLanguage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;

import java.util.ArrayList;
import java.util.List;

public class CheckLanguages extends BaseTest {

    @Test
   /* public void test2() {

        MainPage mainPage = new MainPage();


        List<ListOfLanguage> allLanguages = mainPage.getListOfLanguages();

        List<String> nameOfLanguage = new ArrayList<>();
        for (ListOfLanguage product : allLanguages) {
            nameOfLanguage.add(product.getNameOfLanguage());
        }

        System.out.println(nameOfLanguage);


    }*/


    public void checkLanguages() {

        MainPage mainPage = new MainPage();

        boolean  actualLanguageInList  =
                mainPage.clickOnDropDownLanguages()
                        .getListOfLanguages();

        boolean actualNumbersOfLanguages =
                mainPage.clickOnDropDownLanguages()
                .getNumberOfLanguages();


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualNumbersOfLanguages, true);
        softAssert.assertEquals(actualLanguageInList, true);
        //Assert.assertEquals(actualNumbersOfLanguages, true);
       softAssert.assertAll();

        //Assert.assertTrue();


        //Assert.assertEquals(actualNumbersOfLanguages,44);


    }
}


