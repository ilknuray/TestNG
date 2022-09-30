package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
    pom da Driver icin testBase classina extends etmek yerine driver classindan static methodlar kullanarak
    driver olusturulup ilgili ayarlarin yapilmasi ve en
    sonda driver in kapatilmasi tercih edilmistir.
     */
    static  WebDriver driver;

    public static WebDriver getDriver(){
       if(driver==null) {

           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       }
        return driver;

    }
    public static void closeDriver(){
      if(driver!=null){
      driver.close();
      driver=null;
      }
    }
}
