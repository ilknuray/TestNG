package tests.day21_ReusableMethodsHtmlRaports;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C02_Screenshot {
    @Test
    public void test() throws IOException {
        //hepsiburada sayfasina gidiniz

        Driver.getDriver().get("https://www.hepsiburada.com");

        //sayfanin resmini aliniz.
        ReusableMethods.getScreenshot("hepsiburada");
        Driver.closeDriver();


    }

    @Test
    public void test02() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        //arama sonuc yazisinin fotosu
        ReusableMethods.getScreenshotWebElement("arama sonuc webelementi",amazonPage.aramaSonucuElementi);
    }
}
