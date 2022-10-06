package tests.day21_ReusableMethodsHtmlRaports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RentalPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C05_RaporluTest extends TestBaseRapor {
    @Test
    public void test() {
        /*
    -https://www.bluerentalcars.com/ adresine git

    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */
        extentTest=extentReports.createTest("Pozitif test","Gecerli kullanici adi ve password ile giris yapildi");

        RentalPages rentalPages=new RentalPages();
        Driver.getDriver().get(ConfigReader.getProperty("rentalCar"));
        extentTest.info("Blue rental car sitesine gidildi");
        rentalPages.login.click();
        extentTest.info("login butonuna basildi");
        rentalPages.girisMail.sendKeys(ConfigReader.getProperty("rentMail"));
        extentTest.info("Gecerli mail adresi girildi");
        rentalPages.parola.sendKeys(ConfigReader.getProperty("rentPass"));
        extentTest.info("gecerli password girildi");
        rentalPages.girisTik.click();
        extentTest.info("tekrar login butonuna basildi");
        String actual=rentalPages.isim.getText();
        String expected="John Walker";
        Assert.assertTrue(actual.contains(expected));
        extentTest.pass("basarili giris test yapildi");






    }
}
