package day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClass_AterClass extends TestBase {
    //junitte beforeclass ve after class notasyonuna sahip methodlar static olmak zorundydi.testNG de bu zorunluluk yoktur.
    //testng bize daha fazla before ve after notasyonlari sunar diger before after notasyonlari tanimlayacagimiz grup,test veya suitten once ve
    //sonra calisirlar ileride xml dosyalari ile birlikte bunu gorecegiz

    @BeforeClass
    public void beforeclassMethod() {
        System.out.println("Before class");
    }

    @AfterClass
    public void afterclassMethod() {
        System.out.println("afterclass");
    }

    @Test
    public void amazonTest() {
        driver.get("https://www.amazon.com");

    }

    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproTest() {
        driver.get("https://www.techproeducation.com");
    }
}
