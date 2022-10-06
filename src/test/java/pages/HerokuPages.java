package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuPages {
    public HerokuPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@id='onblur']")
    public WebElement onBlur;

    @FindBy(xpath = "//*[@class='centered']")
    public WebElement bosluk;

    @FindBy(xpath = "//button[@id='onclick']")
    public WebElement onclick;

    @FindBy(xpath = "//button[@id='oncontextmenu']")
    public WebElement oncontextmenu;

    @FindBy(xpath = "//button[@id='ondoubleclick']")
    public WebElement doubleclick;

    @FindBy(xpath = "//button[@id='onfocus']")
    public WebElement focus;

    @FindBy(xpath = "//button[@id='onkeydown']")
    public WebElement onKeydown;

    @FindBy(xpath = "//button[@id='onkeyup']")
    public WebElement keyup;

    @FindBy(xpath = "//button[@id='onkeypress']")
    public WebElement keypress;

    @FindBy(xpath = "//button[@id='onmouseover']")
    public WebElement mouseover;

    @FindBy(xpath = "//button[@id='onmouseleave']")
    public WebElement mouseleave;

    @FindBy(xpath = "//button[@id='onmousedown']")
    public WebElement mousedown;

    @FindBy(xpath = "//*[.='Event Triggered']")
    public List<WebElement>tetikleme;

}