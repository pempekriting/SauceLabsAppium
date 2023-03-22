package pages;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/loginBtn")
    private WebElement btnLogin;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    private WebElement inpUsername;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/passwordET")
    private WebElement inpPassword;

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