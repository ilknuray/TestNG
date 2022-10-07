package tests.day22_crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseCross;

public class C02_SoftAssertCross extends TestBaseCross {
    @Test
    public void test01() {
        SoftAssert softAssert = new SoftAssert();
        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //title in amazon icerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"), "Title amazon icermiyor");
        //arama kutusunun erisilebilir oldugunu test edin
        WebElement aramaK = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaK.isEnabled(), "arama kutusuna z=eriselimeiyor");
        //nutella aratin
        aramaK.sendKeys("Nutella" + Keys.ENTER);
        //arama yapildigini test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed(), "sonuc yazisi gorunmuyor");
        //nutella icerdigini test edin
        softAssert.assertFalse(sonuc.getText().contains("kutella"), "kutella icermiyor");

        //softAssert.assertAll();//bu yazilmazsa assertions gorevi yapilmamis olur tamamlanmaz.
        //softassertun hata bulsa bile calismaya devam etme ozelligi assertall a kadardir eger assertall yazmazsak failed rapor edilirse
        // calisma durur ve classin
        //kalan kismi calismaz.assertalldan sonra yazilan testler eger hata varsa calismaz

    }
}
