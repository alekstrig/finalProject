import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckLanguages extends BaseTest {

    @Test
    public void checkLanguages() {

        MainPage mainPage = new MainPage();

        //int actualNumbersOfLanguages =
                mainPage.clickOnDropDownLanguages()
                .getListOfLanguages();



        //Assert.assertEquals(actualNumbersOfLanguages,44);







    }

}
