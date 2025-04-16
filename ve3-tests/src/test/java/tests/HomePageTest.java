package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageLoads() {
        String expectedTitle = "VE3";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle), "Title check failed");
    }
}
