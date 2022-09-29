package day16_notations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C04_dependsOnMethod extends TestBase {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }
    @Test
    public void test01(){
        //amazon anasayfaya gidelim
        driver.get("https://www.ramazon1.com");
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        //nutella aratalim
        WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        //sonuc yazisinin nutella icerdigini test edelim
        WebElement sonucYazisi= driver.findElement(By.xpath("//*[@class=\"a-section a-spacing-small a-spacing-top-small\"]"));
        Assert.assertTrue(sonucYazisi.getText().contains("Nutella"));

        /*
        dependsOnMethods test methodlarinin calismasirasina calismaz sadece bagli olan test baglanidgi testin sonucuna bakar.
        baglandigi test passed olmazsa baglanan test
        hic calismaz.
         */

    }
}
