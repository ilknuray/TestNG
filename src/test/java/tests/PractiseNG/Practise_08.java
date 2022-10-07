package tests.PractiseNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UniversitePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practise_08 extends TestBaseRapor {

    @Test
    public void test() {
        extentTest=extentReports.createTest("pozitif","tum isleemler tamamlandi");
        UniversitePage universitePage = new UniversitePage();
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("UniversiteUrl"));
        extentTest.info("Verilen url e gidildi");
        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)

        List<String> todoList = new ArrayList<>(Arrays.asList("Kahvaltiyi hazirla", "Bulasiklari yika", "Bebekle ilgilen", "Cocugun odevine yardim et", "Selenyum calis", "Uyu"));
        extentTest.info("gorevler listeye eklendi");
        //buradaki listeyi tek tek eklemek yerine toplu olarak bir loop ile gonderebilmek amaciyla list olusturduk
        for (String w : todoList) {
            ReusableMethods.getActions().click(universitePage.addElement).sendKeys(w).sendKeys(Keys.ENTER).perform();

        }
        extentTest.info("butun gorevler eklendi");


        //Tüm yapılacakların üzerini çiz.
        List<WebElement> ustunuCiz = universitePage.ustunuCizList;
        ustunuCiz.stream().forEach(t -> t.click());
        extentTest.info("gorevlerin ustu cizildi");


        //Tüm yapılacakları sil.
        List<WebElement> deleteList = universitePage.deleteButton;
        deleteList.stream().forEach(t -> t.click());
        extentTest.info("Gorevler silindi");

        //Tüm yapılacakların silindiğini doğrulayın.
        Assert.assertTrue(universitePage.silindiMi.isDisplayed());
        extentTest.pass("silindigi onaylandi");
        Driver.closeDriver();
        extentTest.pass("sayfa kapatildi");
        //EXPLORATORY testing


    }
}
