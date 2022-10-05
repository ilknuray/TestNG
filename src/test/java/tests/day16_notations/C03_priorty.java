package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_priorty extends TestBase {
    /*
    testNg test methodlarini isim siralamasina gore calistirir
    eger isim siralamasinin disinda bir siralama ile calismasini isterseniz o zaman test methodlarina oncelik tanimlayabirsiniz

    priorty kucukten buyuge gore calisir eger bir test methoduna priorty degeri atanmamissa default olarak priorty=0 olarak kabul edilir
     */
    @Test(priority = 0)
    public void amazonTest() {
        driver.get("https://www.amazon.com");

    }

    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }

    @Test(groups = "grup1")
    public void techproTest() {
        driver.get("https://www.techproeducation.com");
    }
}
