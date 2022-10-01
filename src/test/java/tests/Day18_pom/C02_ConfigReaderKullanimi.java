package tests.Day18_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanimi {
    @Test
    public void test() {
        FacebookPage facebookPage=new FacebookPage();
        //facebook,ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        //cikarsa cookies i kabul edin
        facebookPage.cookies.click();

        //kullanici mail kutusunu yanlis isim yazdirin
        facebookPage.mailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUserName"));

        //kullanici password kutusuna rastgele bir password yazdirin
        facebookPage.password.sendKeys(ConfigReader.getProperty("fbwrongPassword"));

        //login butonuna basin
        facebookPage.loginKutusu.click();

        //giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYaziElemnti.isDisplayed());
        //sayfayi kapatin
        Driver.closeDriver();

    }
}
