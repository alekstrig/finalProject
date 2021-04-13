import org.testng.annotations.Test;
import pages.MainPage;

public class CheckCategories extends BaseTest {

    @Test
    public void checkCategories() throws InterruptedException {
        MainPage mainPage = new MainPage();

        mainPage.howerToClothesCategoty();

    }


}
