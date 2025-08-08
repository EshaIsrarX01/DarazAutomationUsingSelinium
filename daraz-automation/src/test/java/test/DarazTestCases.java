package test;

import base.BaseTest;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DarazTestCases extends BaseTest {

    @Test(priority = 1)
    public void testProductSearchAndFilterWithNoResults() {
        HomePage homePage = new HomePage(driver);
        homePage.searchFor("Laptops");
        
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.selectBrand("speedx");
        searchResultPage.applyPriceRangeFilter("500", "5000");
        //searchResultPage.selectFreeShippingFilter();
        searchResultPage.selectFreeShipping("Free Delivery");

        int count = searchResultPage.getProductCount();
        System.out.println("Product count after applying all filters: " + count);
        
        Assert.assertEquals(count, 0, "Products were unexpectedly found with this filter combination.");
    }
}
