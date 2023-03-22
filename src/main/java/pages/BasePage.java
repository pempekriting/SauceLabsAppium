package pages;

import com.github.javafaker.Faker;
import context.TestContext;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Locale;

public class BasePage {

    private final AndroidDriver androidDriver;
    public static final Faker faker = new Faker(new Locale("in-ID"));

    public BasePage(TestContext context) {
        androidDriver = context.androidDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(androidDriver), this);
    }

    private AndroidDriver getDriver() {
        return androidDriver;
    }

    public FluentWait<AndroidDriver> fluentWait() {
        return new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }


    public String getValueAttribute(WebElement webElement, String attributeName) {
        return webElement.getAttribute(attributeName);
    }
}
