package tests.day19_smokeTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RentalPages;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_PositiveLoginTest {
    @Test
    public void test() {
        RentalPages rentalPages = new RentalPages();
        Driver.getDriver().get(ConfigReader.getProperty("rentalCar"));

        rentalPages.login.click();
        rentalPages.email2.sendKeys(ConfigReader.getProperty("rentMail"));
        rentalPages.password2.sendKeys(ConfigReader.getProperty("rentPass"));
        rentalPages.login2.click();

        Assert.assertTrue(rentalPages.continueButton.isDisplayed());

        Select select=new Select(rentalPages.ddbox);
        select.selectByVisibleText("Maserati");


    }
}
