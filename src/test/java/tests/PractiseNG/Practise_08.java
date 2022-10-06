package tests.PractiseNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.UniversitePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practise_08 {
    @Test
    public void test() {
        UniversitePage universitePage=new UniversitePage();
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("UniversiteUrl"));
        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)

        List<String> todoList=new ArrayList<>(Arrays.asList("Kahvaltiyi hazirla","Bulasiklari yika","Bebekle ilgilen","Cocugun odevine yardim et","Selenyum calis","Uyu"));
        //buradaki listeyi tek tek eklemek yerine toplu olarak bir loop ile gonderebilmek amaciyla list olusturduk
        for (String w:todoList) {
            ReusableMethods.getActions().click(universitePage.addElement).sendKeys(w).sendKeys(Keys.ENTER).perform();

        }


        //Tüm yapılacakların üzerini çiz.

        //Tüm yapılacakları sil.
        //Tüm yapılacakların silindiğini doğrulayın.
        //EXPLORATORY testing



    }
}
