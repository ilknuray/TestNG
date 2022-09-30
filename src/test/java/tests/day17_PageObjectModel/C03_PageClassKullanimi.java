package tests.day17_PageObjectModel;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanimi {
    @Test
    public void test() {
        FacebookPage facebookPage = new FacebookPage();
        //facebook,ana sayfaya gidin
        Driver.getDriver().get("https://www.facebook.com");
        facebookPage.cookies.click();

        //kullanici mail kutusunu rastgele isimyazdirin

        Faker faker = new Faker();
        facebookPage.mailKutusu.sendKeys(faker.internet().emailAddress());
        //kullanici password kutusuna rastgele bir password yazdirin
        facebookPage.password.sendKeys(faker.internet().password());
        //login butonuna basin
        facebookPage.loginKutusu.click();
        //giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYaziElemnti.isDisplayed());
        Driver.closeDriver();

    }
}
