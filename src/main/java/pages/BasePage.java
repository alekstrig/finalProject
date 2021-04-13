package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected  static WebDriver driver;

    public static void setDriver (WebDriver webDriver) {driver = webDriver;}

    public static WebDriver getDriver () {return driver;}



    public void scrollToElementWithJS(WebElement element) throws InterruptedException {
        JavascriptExecutor executor = ((JavascriptExecutor) driver);
        executor.executeScript("arguments[0].scrollIntoView(true);", element);

    }
    protected boolean subscribeInput (WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor)getDriver();
        return (Boolean)js.executeScript("return arguments[0].checkValidity();", element);
    }

    protected void waiter (WebElement element) throws InterruptedException {
        Thread.sleep(5000);
    }
    String  myFirstName = "Oleksandr";
    String myLastName = "Trygub";



}
