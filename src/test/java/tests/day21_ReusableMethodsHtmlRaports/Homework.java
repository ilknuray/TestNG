package tests.day21_ReusableMethodsHtmlRaports;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Homework {
    @Test
    public void test() {
        HepsiBuradaPage hepsiBuradaPage=new HepsiBuradaPage();

        //hepsiburada sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("HepsiBuradaUrl"));

        //Elektronik altinda bilgisayar/tablet altindaki tum linkleri tiklayalim


        //her linkten sonra o sayfaya gittigimizi test edelim ve o sayfanin resmini alalim
        //sonra sayfayi kapatalim


    }
}