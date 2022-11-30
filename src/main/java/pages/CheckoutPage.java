package pages;

import context.TestContext;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/fullNameET")
    WebElement inpFullName;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/address1ET")
    WebElement inpAddressLineOne;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cityET")
    WebElement inpCity;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/zipET")
    WebElement inpZipCode;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/countryET")
    WebElement inpCountry;
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/paymentBtn")
    WebElement btnToPayment;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    WebElement inpFullNameCard;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cardNumberET")
    WebElement inpCardNumber;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/expirationDateET")
    WebElement inpExpirationDate;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/securityCodeET")
    WebElement inpSecurityCode;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/paymentBtn")
    WebElement btnReviewOrder;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/completeTV")
    WebElement checkoutCompleteBanner;

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
