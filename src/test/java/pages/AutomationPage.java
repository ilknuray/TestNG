package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement login;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement email;
    @FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
    public WebElement signin;
    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement gender;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@id='days']")
    public WebElement days;
    @FindBy(xpath = "//*[@id='months']")
    public WebElement months;
    @FindBy(xpath = "//*[@id='years']")
    public WebElement years;
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement hesapOlustu;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement devam;
    @FindBy(xpath = "//*[text()='ilknur']")
    public WebElement ilknur;
    @FindBy(xpath = "(//div[@class='product-overlay'])[1]")
    public WebElement product;
    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement sepet;
    @FindBy(xpath = "//h4[@class='modal-title w-100']")
    public WebElement added;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement cart;
    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement odeme;
    @FindBy(xpath = "(//*[@class='address_address1 address_address2'])[2]")
    public WebElement ilkAdres;
    @FindBy(xpath = "(//*[@class='address_address1 address_address2'])[5]")
    public WebElement ikinciAdres;
    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement delete;
    @FindBy(xpath = "(//*[text()='Delete Account'])[2]")
    public WebElement silindiMi;

    @FindBy(xpath = "//*[text()=' Home']")
    public WebElement home;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUser;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement account;

    @FindBy(xpath = "//img[@src=\"/static/images/home/logo.png\"]")
    public WebElement resimGorunuyormu;

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement productK;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement allPruduct;
    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement pruductTikla;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement aramaButonu;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement arananUrun;

    @FindBy(xpath = "//div[@class='overlay-content']")
    public WebElement urunUstuneGit;

    @FindBy(linkText = "View Product")
    public WebElement viewProduct;
}
