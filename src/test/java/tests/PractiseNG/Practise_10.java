package tests.PractiseNG;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Practise_10 extends TestBaseRapor {
    @Test
    public void test(){
        extentTest=extentReports.createTest("pozitif test","urunlerin gorunurlugu test edildi");
        AutomationPage automationPage=new AutomationPage();
        // 1. Tarayıcıyı başlat

// 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("AtomationExcerciseUrl"));
        extentTest.info("url e gidildi");

// 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://automationexercise.com/";
        Assert.assertEquals(actualUrl,expectedUrl);

// 4. 'Ürünler' butonuna tıklayın
        automationPage.productK.click();
        extentTest.info("urunler tiklandi");
// 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        String allProduct=automationPage.allPruduct.getText();
        Assert.assertTrue(allProduct.contains("ALL PRODUCTS"));
// 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
       automationPage.pruductTikla.click();
       automationPage.pruductTikla.sendKeys("Blue Top"+ Keys.ENTER);
       automationPage.aramaButonu.click();
       extentTest.info("istenen urun arandi");

// 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        String arananUrun=automationPage.arananUrun.getText();
        Assert.assertTrue(automationPage.arananUrun.isDisplayed());
// 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
       // ReusableMethods.getActions().sendKeys(Keys.PAGE_DOWN);
       ReusableMethods.getActions().moveToElement(automationPage.urunUstuneGit);
       Assert.assertTrue(automationPage.viewProduct.isDisplayed());
       extentTest.pass("aranan urunun gorunurlugu dogrulandi");

    }
}
