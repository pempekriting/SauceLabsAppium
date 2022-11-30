package pages;

import context.TestContext;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productIV")
    List<WebElement> listProducts;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/colorIV")
    List<WebElement> listProductColors;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/plusIV")
    WebElement btnPlusQty;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    WebElement btnAddToCart;

    public ProductsPage(TestContext context) {
        super(context);
    }

    public void chooseProduct(String productName) {
        listProducts.stream().filter(element -> element.getAttribute("content-desc").equals(productName)).findFirst().get().click();
    }

    public void chooseColor(String colorName) {
        listProductColors.stream().filter(element -> element.getAttribute("content-desc").equals(colorName)).findFirst().get().click();
    }

    public ProductsPage inputQty(int quantity) {
        if (quantity > 1) {
            for (int i = 0; i < quantity - 1; i++) {
                btnPlusQty.click();
            }
        }
        return this;
    }

    public void andThenAddToCart() {
        btnAddToCart.click();
    }
}
