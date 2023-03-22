package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;

public class CheckoutSteps {

    private final ProductsPage productsPage;
    private final LoginPage loginPage;
    private final CheckoutPage checkoutPage;
    private final HeaderNavigation headerNavigation;
    private final MyCartPage myCartPage;

    public CheckoutSteps(TestContext context) {
        productsPage = new ProductsPage(context);
        loginPage = new LoginPage(context);
        checkoutPage = new CheckoutPage(context);
        headerNavigation = new HeaderNavigation(context);
        myCartPage = new MyCartPage(context);
    }

    @Given("User is already on Sauce Labs Apps")
    public void userIsAlreadyOnSauceLabsApps() {
        Assert.assertTrue(headerNavigation.isCartDisplayed());
    }

    @When("User choose product")
    public void userChooseProduct() {
        productsPage.chooseProduct("Sauce Lab Back Packs");
    }

    @And("User choose color")
    public void userChooseColor() {
        productsPage.chooseColor("Blue color");
    }

    @And("User input quantity")
    public void userInputQuantity() {
        productsPage.inputQty(2)
                .andThenAddToCart();
    }

    @And("User go to my cart page to proceed to checkout")
    public void userGoToMyCartPageToProceedToCheckout() {
        headerNavigation.clickCart();
        myCartPage.clickProceedToCheckoutButton();
    }

    @And("User login with correct credentials")
    public void userLoginWithCorrectCredentials() {
        loginPage.inputUsername()
                .inputPassword()
                .andLogin();
    }

    @And("User fill the shipping address")
    public void userFillTheShippingAddress() {
        checkoutPage.inputFullName()
                .inputAddressLineOne()
                .inputCityName()
                .inputZipCode()
                .inputCountryName()
                .andClickToPaymentButton();

    }

    @And("User fill the payment method")
    public void userFillThePaymentMethod() {
        checkoutPage.inputFullNameCard()
                .inputCardNumber()
                .inputExpirationDate()
                .inputSecurityCode()
                .andClickReviewOrderButton();
    }

    @And("User place an order")
    public void userPlaceAnOrder() {
        checkoutPage.clickPlaceOrderButton();
    }

    @Then("User successfully checkout the goods")
    public void userSuccessfullyCheckoutTheGoods() {
        Assert.assertTrue(checkoutPage.isCheckoutCompleteBannerDisplayed());
    }
}
