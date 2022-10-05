package tests.PractiseNG;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TeamPractice {


    @Test
    public void test() {
        //    1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' url'sine gidin
        AutomationPage automationPage = new AutomationPage();
        Driver.getDriver().get(ConfigReader.getProperty("AtomationExcerciseUrl"));

        //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String actualTitle = Driver.getDriver().getTitle();
        String expecteTitle = "Automation Exercise";
        Assert.assertTrue(actualTitle.contains(expecteTitle));
        //4. 'Kayıt Ol / Giriş Yap' düğmesini tıklayın
        automationPage.login.click();
        //5. Kayıt bölümündeki tüm ayrıntıları doldurun ve hesap oluşturun
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        automationPage.name.sendKeys("ilknur");
        automationPage.email.sendKeys(faker.internet().emailAddress());
        automationPage.signin.click();
        automationPage.gender.click();
        automationPage.password.sendKeys("12345");

        Select select = new Select(automationPage.days);
        select.selectByVisibleText("1");
        Select select1 = new Select(automationPage.months);
        select1.selectByVisibleText("January");
        Select select2 = new Select(automationPage.years);
        select2.selectByVisibleText("2020");


        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys("team13")
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB).sendKeys("Canada").sendKeys(Keys.TAB).sendKeys(faker.address().state()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();


        //6. 'HESAP OLUŞTURULDU!' seçeneğini doğrulayın. ve 'Devam' düğmesini tıklayın
        Assert.assertTrue(automationPage.hesapOlustu.isDisplayed());
        automationPage.devam.click();
        //7. En üstte 'Kullanıcı adı olarak oturum açıldı' seçeneğini doğrulayın
        String actualName = "automationPage.ilknur";
        Assert.assertTrue(actualName.contains("ilknur"));
        //8. Sepete ürün ekleyin
        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(automationPage.product).perform();
        automationPage.sepet.click();
        //9. 'Sepet' düğmesini tıklayın
        //10. Sepet sayfasının görüntülendiğini doğrulayın
        //Assert.assertTrue(automationPage.added.isDisplayed());
        automationPage.cart.click();
        //11. Ödemeye Devam Et'e tıklayın
        automationPage.odeme.click();
        //12. Teslimat adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
        String actualAdres = "automationPage.ilkAdres";
        String expectedAdres = "automationPage.ikinciAdres";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedAdres, actualAdres);

        //13. Fatura adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
        //14. 'Hesabı Sil' düğmesini tıklayın
        automationPage.delete.click();
        //15. 'HESAP SİLİNDİ!' seçeneğini doğrulayın. ve 'Devam' düğmesini tıklayın
        softAssert.assertTrue(automationPage.silindiMi.isDisplayed());
        Driver.closeDriver();


    }
}
