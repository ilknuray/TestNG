package tests.day17_PageObjectModel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {
    @Test
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();
        //amazona gidelim nutella aratalim sonuc yazisinin nutella icerdigini test edelim

        Driver.getDriver().get("https://www.amazon.com");
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        String actualsonuc=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualsonuc.contains("Nutella"));
        Driver.closeDriver();
    }
}
