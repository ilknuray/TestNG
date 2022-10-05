package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HepsiBuradaPage {
    public HepsiBuradaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "sf-MenuItems-WulWXvlfIAwNiOUGY7FP")
    public List<WebElement>basliklar;
}
