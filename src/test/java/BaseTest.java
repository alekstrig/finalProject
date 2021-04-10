import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {



    @BeforeMethod
    public void createDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.prestashop.com/");
        waitLoadingStarts(driver);
        waitLoadingEnds(driver);
        driver.switchTo().frame("framelive");
        BasePage.setDriver(driver);
    }

    private void waitLoadingStarts(WebDriver driver) {

        try {
            WebElement waitStartLoading = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='loadingMessage']")));

        } catch (NoSuchElementException e) {
            System.out.println("No any adv appears");
        }
    }
    private void waitLoadingEnds(WebDriver driver) {
        try {

            Boolean waitEndsLoading = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loadingMessage']")));


        } catch (NoSuchElementException e) {
            System.out.println("No any adv appears");
        }


    }

    @AfterMethod
    public void quite() throws InterruptedException { BasePage.getDriver().quit();
    Thread.sleep(3000);}

}




