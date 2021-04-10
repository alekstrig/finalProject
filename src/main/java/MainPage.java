import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(xpath = "//input[@type ='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@value = 'Subscribe']")
    private WebElement subScribeButton;

   // @FindBy(xpath = "//form[@method = 'post']//p[@class]")
   // private WebElement checkEmailField;

    @FindBy(xpath = "//button[@data-toggle = 'dropdown']")
    private WebElement dropDownLanguages;

    @FindBy(xpath = "//ul[@aria-labelledby = 'language-selector-label']")
    private WebElement listOfLanguages;


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






}
