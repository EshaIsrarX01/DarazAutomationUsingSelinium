package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isFreeShippingAvailable() {
        // A more reliable way to check for free shipping by targeting a specific element.
        // Replace '.free-shipping-text' with the actual CSS selector for the free shipping element.
        By freeShippingLocator = By.cssSelector(".shipping-summary--3W0W8 .item--37g9a");
        
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(freeShippingLocator));
            // You can also add an assertion that the text is 'Free Shipping' if needed.
            // For example: wait.until(ExpectedConditions.textToBePresentInElementLocated(freeShippingLocator, "Free Shipping"));
            return driver.findElement(freeShippingLocator).isDisplayed();
        } catch (Exception e) {
            System.out.println("Free shipping element not found: " + e.getMessage());
            return false;
        }
    }
}