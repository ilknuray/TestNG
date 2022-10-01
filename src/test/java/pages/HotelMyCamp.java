package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCamp {
   public HotelMyCamp(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='navLogon']")
    public WebElement login;

   @FindBy(id = "UserName")
    public WebElement name;

   @FindBy(id = "Password")
    public WebElement password;

   @FindBy(id = "btnSubmit")
    public WebElement giris;

   @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement sayfayaGirildi;



}
