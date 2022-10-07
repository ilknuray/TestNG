package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UniversitePage {
    public UniversitePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//input[@type='text']")
    public WebElement addElement;

    @FindBy(xpath = "//li")
    public List<WebElement>ustunuCizList;

    @FindBy(xpath = "//i[@class='fa fa-trash']")
    public List<WebElement>deleteButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement silindiMi;

}
