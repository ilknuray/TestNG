package tests.day22_crossBrowser;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RentalPages;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_NegativeLoginDataProvider {
    @DataProvider
    public static Object[][] KullaniciListesi() {
        Object [][] kullaniciBilgileri={{"firuze@nehaber.com","54678"},{"murat@benbuIsibilirim.com","6789"},{"ilyas@hollandadanselam.com","123"}};
        return kullaniciBilgileri;
    }

    @Test(dataProvider = "KullaniciListesi")
    public void yanlisSifre(String userMail,String password) {
        RentalPages rentalPages = new RentalPages();
        Driver.getDriver().get(ConfigReader.getProperty("rentalCar"));

        rentalPages.login.click();
        //test data userMail i data provider dan alalim
        rentalPages.email2.sendKeys(userMail);
        rentalPages.password2.sendKeys(password);
        rentalPages.login2.click();

        Assert.assertTrue(rentalPages.login2.isDisplayed());


        Driver.closeDriver();


    }
}
