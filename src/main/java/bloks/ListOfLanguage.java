package bloks;

import lombok.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor

public class ListOfLanguage {


    //private WebElement image;
    //private WebElement productName;
    //    private String description;
    private String nameOfLanguage;
//    private String discountPrice;
//    private String tax;
//    private WebElement addToCartButton;
//    private WebElement addToWishListButton;
//    private WebElement compareButton;


    public ListOfLanguage() {
    }

    public ListOfLanguage(WebElement container) {

        this.nameOfLanguage = container.findElement(By.xpath(".//a[contains(@href, 'show')]")).getText();
//        this.discountPrice = discountPrice;
//        this.tax = tax;
//        this.addToCartButton = addToCartButton;
//        this.addToWishListButton = addToWishListButton;
//        this.compareButton = compareButton;
    }

    public List<ListOfLanguage>getLanguage(List<WebElement> containers) {
        List<ListOfLanguage> allLanguage = new ArrayList<>();
        for (WebElement container : containers) {
            allLanguage.add(new ListOfLanguage(container));
        }
        return allLanguage;
    }

}

