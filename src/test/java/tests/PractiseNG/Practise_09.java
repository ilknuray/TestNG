package tests.PractiseNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuPages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Practise_09 {
    HerokuPages herokuPages;

    @Test
    public void test() {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        //Click all the buttons and verify they are all clicked

        herokuPages = new HerokuPages();/*kodlarimizi yazarken clean code kapsaminda daha sade code yazabilmek amaciyla
         her test methodu icerisinde ayri bir object
         object create etmek yerine bu objecti class seviyesinde instance olarak create
         edip test methodlarinda buna deger atamak ve kullanmak daha uygun bir yontemdir.*/

        herokuPages.onBlur.click();herokuPages.bosluk.click();
        herokuPages.onclick.click();
        ReusableMethods.getActions().contextClick(herokuPages.oncontextmenu).perform();
        ReusableMethods.getActions().doubleClick(herokuPages.doubleclick).perform();
        herokuPages.focus.click();
        ReusableMethods.getActions().click(herokuPages.onKeydown).sendKeys(Keys.ENTER).click(herokuPages.keyup).sendKeys(Keys.ENTER)
                .click(herokuPages.keypress).sendKeys(Keys.ENTER)
                .moveToElement(herokuPages.mouseover)
                .moveToElement(herokuPages.mouseleave).moveToElement(herokuPages.bosluk)
                .click(herokuPages.mousedown).perform();

        ReusableMethods.waitFor(3);

        List<WebElement>tiklananlar=herokuPages.tetikleme;
        Assert.assertEquals(tiklananlar.size(),11);


    }
}
