package tests.PractiseNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonMentoring {
    @Test
    public void test() {
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(amazonPage.liste).perform();
        actions.moveToElement(amazonPage.yeniListe).sendKeys(Keys.ENTER).perform();
        amazonPage.yeniListe.click();
        amazonPage.sigin.click();
        amazonPage.email.sendKeys(ConfigReader.getProperty("amazonEmail"));
        amazonPage.pass.sendKeys(ConfigReader.getProperty("amazonPass"));
        amazonPage.sigin2.click();
        amazonPage.createList.click();

    }
}
