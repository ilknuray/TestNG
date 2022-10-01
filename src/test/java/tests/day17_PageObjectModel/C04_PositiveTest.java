package tests.day17_PageObjectModel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_PositiveTest {
    @Test
    public void test() {
        //https://www.hotelmycamp.com/ a git
        Driver.getDriver().get(ConfigReader.getProperty("hotel"));
        HotelMyCamp hotelMyCamp = new HotelMyCamp();
        hotelMyCamp.login.click();
        // password= Manager1
        hotelMyCamp.name.sendKeys(ConfigReader.getProperty("htlName"));
        hotelMyCamp.password.sendKeys(ConfigReader.getProperty("htlPassword"));
        hotelMyCamp.giris.click();

        //name=manager

        //sayfaya girilebilindigini test et
        Assert.assertTrue(hotelMyCamp.sayfayaGirildi.isDisplayed());
        Driver.closeDriver();

    }
}
