package tests.PractiseNG;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TeamPractice {



    @Test
    public void test() {
        //    1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' url'sine gidin
        AutomationPage automationPage=new AutomationPage();
        Driver.getDriver().get(ConfigReader.getProperty("AtomationExcerciseUrl"));

        //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
       String actualTitle= Driver.getDriver().getTitle();
       String expecteTitle="Automation Exercise";
        Assert.assertTrue(actualTitle.contains(expecteTitle));
        //4. 'Kayıt Ol / Giriş Yap' düğmesini tıklayın
        automationPage.login.click();
        //5. Kayıt bölümündeki tüm ayrıntıları doldurun ve hesap oluşturun
        automationPage.name.sendKeys("ilknur");
        automationPage.email.sendKeys("abc.def@gmail.com");
        automationPage.signin.click();
        automationPage.gender.click();
        automationPage.password.sendKeys("12345");

        Select select=new Select(automationPage.days);
        select.selectByVisibleText("1");
        Select select1=new Select(automationPage.months);
        select1.selectByVisibleText("January");
        Select select2=new Select(automationPage.years);
        select2.selectByVisibleText("2020");

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.sendKeys(faker.name().firstName());



        //6. 'HESAP OLUŞTURULDU!' seçeneğini doğrulayın. ve 'Devam' düğmesini tıklayın
        //7. En üstte 'Kullanıcı adı olarak oturum açıldı' seçeneğini doğrulayın
        //8. Sepete ürün ekleyin
        //9. 'Sepet' düğmesini tıklayın
        //10. Sepet sayfasının görüntülendiğini doğrulayın
        //11. Ödemeye Devam Et'e tıklayın
        //12. Teslimat adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
        //13. Fatura adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
        //14. 'Hesabı Sil' düğmesini tıklayın
        //15. 'HESAP SİLİNDİ!' seçeneğini doğrulayın. ve 'Devam' düğmesini tıklayın

    }
}
