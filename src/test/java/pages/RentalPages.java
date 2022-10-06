package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RentalPages {

    public RentalPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login;

    @FindBy(xpath = "//*[text()='Create new user']")
    public WebElement yeniKayit;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement name;

    @FindBy(xpath = "//*[text()='Please enter your last name']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phone;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement adres;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zip;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement pass1;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement pass2;

    @FindBy(xpath = "//button[text()=' Register']")
    public WebElement register;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email2;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password2;

    @FindBy(xpath = "//button[text()=' Login']")
    public WebElement login2;

    @FindBy(xpath = "//select[@name='car']")
    public WebElement ddbox;

    @FindBy(xpath = "//button[@class='w-100 btn btn-primary btn-lg']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement girisMail;
    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement parola;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement girisTik;
    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement isim;


}
