package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_Practise extends TestBase {
    @Test
    public void Test(){
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        WebElement cook= driver.findElement(By.xpath("//button[@id='ez-accept-all']"));
        cook.click();
        //fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("aaa");
        //fill the lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bbb");
        //check the gender
        driver.findElement(By.xpath("//input[@id='sex-1']")).click();
        //check the experience
        driver.findElement(By.xpath("//input[@id='exp-1']")).click();
        //fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/10/2022");
        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id=\"profession-1\"]")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id=\"tool-2\"]")).click();
        //choose your continent -> Antartica
        WebElement ddb= driver.findElement(By.xpath("//select[@id='continents']"));
        Select select=new Select(ddb);
        select.selectByVisibleText("Antartica");
        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//*[text()='Browser Commands']")).click();
        //click submit button
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

    }
}
