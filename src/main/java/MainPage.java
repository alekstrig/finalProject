import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'input-wrapper']")
    private WebElement emailField;

    @FindBy(xpath = "//div[@class = 'col-xs-12']/input")
    private WebElement subScribeButton;

    @FindBy(xpath = "//form[@method = 'post']//p[@class]")
    private WebElement checkEmailField;


    public MainPage() {
        PageFactory.initElements(getDriver(), this); }

    public MainPage enterEmailField(String email) {

        emailField.sendKeys(email);
        return this;
    }

    public MainPage clickOnSubScribeButton() {
        subScribeButton.click();
        return this;
    }

    public String checkInvalidEmail() {
        return checkEmailField.getText();

    }




}
