package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;
import java.time.Duration;
import java.util.List;

public class SearchResultPage {
    WebDriver driver;
    WebDriverWait wait;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectBrand(String brandName) {
        WebElement brand = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(.,'" + brandName + "')]")));
        brand.click();
    }

    public void applyPriceRangeFilter(String minPriceValue, String maxPriceValue) {
        WebElement minPrice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Min']")));
        minPrice.sendKeys(minPriceValue);

        WebElement maxPrice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Max']")));
        maxPrice.sendKeys(maxPriceValue);
        
        WebElement goBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ant-btn-primary")));
        goBtn.click();
    }
    
    public void selectFreeShipping(String shippmentName) {
        WebElement shippment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(.,'" + shippmentName + "')]")));
        shippment.click();
    }

    public int getProductCount() {
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".gridItem--Yd0sa")));
            List<WebElement> products = driver.findElements(By.cssSelector(".gridItem--Yd0sa"));
            return products.size();
        } catch (org.openqa.selenium.TimeoutException e) {
            return 0;
        }
    }
}

