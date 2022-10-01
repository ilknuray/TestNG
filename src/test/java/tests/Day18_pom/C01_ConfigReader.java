package tests.Day18_pom;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_ConfigReader {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

    }
}
