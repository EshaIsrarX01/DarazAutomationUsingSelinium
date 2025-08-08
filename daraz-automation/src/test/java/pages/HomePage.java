package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By searchBox = By.name("q");
    By searchButton = By.className("search-box__button--1oH7");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFor(String item) {
        driver.findElement(searchBox).sendKeys(item);
        driver.findElement(searchButton).click();
    }

    
}
