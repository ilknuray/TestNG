package tests.day19_smokeTest;

import org.testng.annotations.Test;
import pages.RentalPages;
import utilities.Driver;

public class C02_NegativeLoginTest {
    RentalPages rentalPages=new RentalPages();
    @Test
    public void test() {


        Driver.getDriver().get("https://www.bluerentalcars.com");
        rentalPages.login2.click();
        rentalPages.email.sendKeys("custom@bluerentalcars.com");



    }
}
