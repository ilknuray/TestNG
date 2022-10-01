package tests.PractiseNG;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01 {
    @Test
    public void test() {
        //go to http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        //fill in capitals by country
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();

        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDrop(dhtmlgoodiesPage.italy, dhtmlgoodiesPage.rome).
                dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.unitedState).
                dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).
                dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norwey).
                dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweden).
                dragAndDrop(dhtmlgoodiesPage.seul, dhtmlgoodiesPage.soutKorea).
                dragAndDrop(dhtmlgoodiesPage.kopenhag, dhtmlgoodiesPage.denmark).perform();
        Driver.closeDriver();
        /*reusable maintainable,rahat manipule edilebilir bir framework icin bir design pattern olarak pom modelde karar vrmisler
        1 driver class
        2 pages class
        3 tests class
        olmazsa olmazdir
        4 utilities
        aradigimiz bir webE yada bir methodu bulabilmek ve guncellemek icin pom olusturulmustur
         */
    }
}
