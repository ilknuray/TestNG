package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {
    @DataProvider
    public static Object[][] AranacakKelimeler() {
        Object[][] aranaKelimeArray={{"Nutella"},{"Java"},{"Cigdem"},{"Netherlands"}};
        return aranaKelimeArray;
    }

    @Test
    public void test() {
        AmazonPage amazonPage = new AmazonPage();
        //amazon a git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //nutella ara
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //sonuclar nutella iceriyor mu
        String actualText = amazonPage.aramaSonucuElementi.getText();
        String expectedText = "Nutella";
        Assert.assertTrue(actualText.contains(expectedText));

    }

    @Test(dataProvider = "AranacakKelimeler")
    //arayacagimiz kelimeleri bir liste gibi tutup bana yollayacak bir veri saglayicisi olusturacagiz
    public void test02(String arananKelime) {
        AmazonPage amazonPage=new AmazonPage();
        //amazona git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //nutella java cigdem ve netherlands icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);
        //sonuclarin aradigimiz kelimelri icerdegini test edelim
        String actualText = amazonPage.aramaSonucuElementi.getText();
        String expectedText = arananKelime;
        Assert.assertTrue(actualText.contains(expectedText));

        //sayfayi kapatalim
        Driver.closeDriver();
    }
}
