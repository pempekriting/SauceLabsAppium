package pages;

import context.TestContext;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HeaderNavigation extends BasePage {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    WebElement cartIcon;

    public HeaderNavigation(TestContext context) {
        super(context);
    }

    public void clickCart() {
        cartIcon.click();
    }

    public boolean isCartDisplayed() {
        return cartIcon.isDisplayed();
    }
}
