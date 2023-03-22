package pages;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderNavigation extends BasePage {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private WebElement cartIcon;

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
