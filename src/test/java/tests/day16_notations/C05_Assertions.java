package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_Assertions extends TestBase {
    @Test
    public void test01() {
        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //title in amazon icerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        //arama kutusunun erisilebilir oldugunu test edin
        WebElement aramaK= driver.findElement(By.id("twotabsearchtextbox"));
        //nutella aratin
        aramaK.sendKeys("Nutella"+ Keys.ENTER);
        //arama yapildigini test edin
        WebElement sonuc= driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonuc.isDisplayed());
        //nutella icerdigini test edin
        Assert.assertTrue(sonuc.getText().contains("Nutella"));



    }
}
