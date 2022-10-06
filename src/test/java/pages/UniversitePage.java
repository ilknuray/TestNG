package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UniversitePage {
    public UniversitePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//input[@type='text']")
    public WebElement addElement;
    @FindBy(xpath = "//*[text()=' Go to potion class']")
    public WebElement ustunuCiz;
}
