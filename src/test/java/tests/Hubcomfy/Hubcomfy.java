package tests.Hubcomfy;

import org.testng.annotations.Test;
import pages.HubcomfyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Hubcomfy {
    @Test
    public void test01() {
        HubcomfyPage hubcomfyPage=new HubcomfyPage();
        //sayfaya gidildi
        Driver.getDriver().get(ConfigReader.getProperty("HubcomfyUrl"));

        //login butonuna basildi
        hubcomfyPage.signIn.click();


    }
}
