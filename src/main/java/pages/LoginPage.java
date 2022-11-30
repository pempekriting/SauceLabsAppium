package pages;

import context.TestContext;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/loginBtn")
    WebElement btnLogin;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    WebElement inpUsername;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordET")
    WebElement inpPassword;

    public LoginPage(TestContext context) {
        super(context);
    }

    public LoginPage inputUsername() {
        inpUsername.sendKeys("bod@example.com");
        return this;
    }

    public LoginPage inputPassword() {
        inpPassword.sendKeys("10203040");
        return this;
    }

    public void andLogin() {
        btnLogin.click();
    }
}