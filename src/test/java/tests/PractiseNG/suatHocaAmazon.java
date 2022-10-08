package tests.PractiseNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class suatHocaAmazon {
    @Test
    public void test() {
        AmazonPage amazonPage=new AmazonPage();
        //1. Amazon sayfasını acalım
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //2. sayfanın acıldıgını dogrulayalım

        //3.header daki sigin butonuna basalım
        ReusableMethods.getActions().moveToElement(amazonPage.ustuneGit);
        amazonPage.bastakiGiris.click();
        //4. kullanıc adı ve şifre bilgisini girerek login olalım
        amazonPage.email.sendKeys(ConfigReader.getProperty("amazonEmail"));
        amazonPage.devam.click();
        amazonPage.pass.sendKeys(ConfigReader.getProperty("amazonPass"));
        amazonPage.sigin2.click();

        //5. başarılı bir şekilde login oldugumuzu dogrulayalım.
        String giris=amazonPage.girisYapildi.getText();
        Assert.assertTrue(giris.contains("YILMAZ"));

        //6. header da account butonu altında create a list butonuna basalım
        ReusableMethods.hover(amazonPage.createIcinUstuneGit);
        amazonPage.createList.click();
        //7. create a list sayfasının açıldıgını dogrulayalım
        Assert.assertTrue(amazonPage.createlist2gorundu.isDisplayed());
        //8.sayfada bulunan create a list butonuna basalım
       // amazonPage.createlist2.click();

        //9.açılan popup menuden oluşturacagımız listenin adını girelim ve create a list butonuna basalım
        amazonPage.listeAdi.sendKeys("electronics");
        amazonPage.yineCreate.click();
        //10. listemin başarılı bir şekilde oluştugunu dogrulayalım
        //11. kategori bölümünden computers seçilir
        ReusableMethods.select(amazonPage.kategoriKutusu).selectByVisibleText("Computers");
        //12. kategori bolumnde computer seçili oldugunu dogrulayım
        String actualKategori=ReusableMethods.select(amazonPage.kategoriKutusu).getFirstSelectedOption().getText();
        Assert.assertTrue(actualKategori.contains("Computers"));
        //13. arama kutusuna msi yazıp aratalım
        amazonPage.aramaKutusu.sendKeys("msi"+Keys.ENTER);

        //14. arama kutusunda msi arandığını dogrulayalım

        //15. gelen ürün sayfasında 2. sayfaya gecelim

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
       // js.executeScript("arguments[0].scrollIntoView(true)",amazonPage.ikinciSayfa);
        ReusableMethods.jsclick(amazonPage.ikinciSayfa);
        //16. 2. sayfadaki 2. urunu secelim
        amazonPage.ikinciUrun.click();
        //17. acılan sayfada gelen urunun 2. urun oldugunu dogrulayalım
        //18. urunu listemize ekleyelim

        //19. listemizi açalım
        //20. listemizdeki urunumuzu silelim
        //21. listemizdeki urunumuzun silindigi dogrulayaım
        //22. siteden logout olalım
        //23. logout dogrulayalım.
        //Collapse
    }
}
