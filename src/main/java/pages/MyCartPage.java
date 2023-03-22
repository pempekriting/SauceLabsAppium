package pages;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyCartPage extends BasePage {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement btnProceedToCheckout;

    public MyCartPage(TestContext context) {
        super(context);
    }

    public void clickProceedToCheckoutButton() {
        btnProceedToCheckout.click();
    }
}
