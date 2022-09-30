package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")
    public WebElement cookies;

    @FindBy(id="email")
    public WebElement mailKutusu;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(name = "login")
    public WebElement loginKutusu;

    @FindBy(className = "_9ay7")
    public WebElement girilemediYaziElemnti;


}