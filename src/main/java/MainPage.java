import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class MainPage extends BasePage {

    @FindBy(xpath = "//input[@type ='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@value = 'Subscribe']")
    private WebElement subScribeButton;

   // @FindBy(xpath = "//form[@method = 'post']//p[@class]")
   // private WebElement checkEmailField;

    @FindBy(xpath = "//button[@data-toggle = 'dropdown']")
    private WebElement dropDownLanguages;

   @FindBy(xpath = "//a[contains(@href, 'show')]")
   private List<WebElement> listOfLanguages;


    public MainPage() {
        PageFactory.initElements(getDriver(), this); }

    public MainPage enterEmailField(String email) throws InterruptedException {

        scrollToElementWithJS(emailField);
        emailField.sendKeys(email);

        return this;
    }

    public MainPage clickOnSubScribeButton() throws InterruptedException {
        subScribeButton.click();
        return this;
    }

    public boolean  checkInvalidEmail() {
        return subscribeInput(emailField);

    }

    public MainPage clickOnDropDownLanguages() {
        dropDownLanguages.click();
        return this;
    }

    public MainPage getListOfLanguages() {
          List<WebElement> countLanguage = listOfLanguages;
        System.out.println(countLanguage.size());




          return this;

    }
    //List<WebElement> allSmile = driver.findElements(By.xpath("//tbody/*//i[@class ='media-photo fa fa-smile-o fa-3x']"));








}
