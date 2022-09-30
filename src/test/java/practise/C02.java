package practise;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02 extends TestBase {
    @Test
    public void test() {
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.xpath("//*[@id='button1']")).click();
        System.out.println(driver.switchTo().alert().getText());

        // 3. Açılır metni alın
        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        Assert.assertTrue(driver.switchTo().alert().getText().contains("I am an alert box!"));
        // 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();
    }
}
