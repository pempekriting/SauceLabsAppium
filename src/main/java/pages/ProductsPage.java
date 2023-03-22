package pages;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/productIV")
    private List<WebElement> listProducts;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/colorIV")
    private List<WebElement> listProductColors;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/plusIV")
    private WebElement btnPlusQty;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement btnAddToCart;

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
