package pages;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/fullNameET")
    private WebElement inpFullName;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/address1ET")
    private WebElement inpAddressLineOne;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cityET")
    private WebElement inpCity;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/zipET")
    private WebElement inpZipCode;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/countryET")
    private WebElement inpCountry;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/paymentBtn")
    private WebElement btnToPayment;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    private WebElement inpFullNameCard;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cardNumberET")
    private WebElement inpCardNumber;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/expirationDateET")
    private WebElement inpExpirationDate;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/securityCodeET")
    private WebElement inpSecurityCode;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/paymentBtn")
    private WebElement btnReviewOrder;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/completeTV")
    private WebElement checkoutCompleteBanner;

    public CheckoutPage(TestContext context) {
        super(context);
    }

    public CheckoutPage inputFullName() {
        inpFullName.sendKeys(faker.name().fullName());
        return this;
    }

    public CheckoutPage inputAddressLineOne() {
        inpAddressLineOne.sendKeys(faker.address().fullAddress());
        return this;
    }

    public CheckoutPage inputCityName() {
        inpCity.sendKeys(faker.address().cityName());
        return this;
    }

    public CheckoutPage inputZipCode() {
        inpZipCode.sendKeys(faker.address().zipCode());
        return this;
    }

    public CheckoutPage inputCountryName() {
        inpCountry.sendKeys(faker.address().country());
        return this;
    }

    public CheckoutPage inputFullNameCard() {
        inpFullNameCard.sendKeys(faker.name().fullName());
        return this;
    }

    public CheckoutPage inputCardNumber() {
        inpCardNumber.sendKeys(faker.finance().creditCard());
        return this;
    }

    public CheckoutPage inputExpirationDate() {
        inpExpirationDate.sendKeys("1130");
        return this;
    }

    public CheckoutPage inputSecurityCode() {
        inpSecurityCode.sendKeys(faker.number().digits(3));
        return this;
    }

    public void andClickReviewOrderButton() {
        btnReviewOrder.click();
    }

    public void andClickToPaymentButton() {
        btnToPayment.click();
    }

    public void clickPlaceOrderButton() {
        btnReviewOrder.click();
    }

    public boolean isCheckoutCompleteBannerDisplayed() {
        return checkoutCompleteBanner.isDisplayed();
    }
}
