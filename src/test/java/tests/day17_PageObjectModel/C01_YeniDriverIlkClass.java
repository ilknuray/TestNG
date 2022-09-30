package tests.day17_PageObjectModel;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_YeniDriverIlkClass {
    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
        //bugune kadar testbase classina extends ederek kullandigimiz
        // driver yerine bundan sonra Driver classindan kullanacagimiz getDriver static methodunu kullanacagiz

        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");

        Driver.closeDriver();//en sona koymama gerek yok istedigim yere koyarim ac kapat
    }
}
