package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucuElementi;
    @FindBy(xpath = "//*[@class='nav-line-2 ']")
    public WebElement liste;
    @FindBy(xpath = "//*[text()='Create a List']")
    public WebElement yeniListe;

    @FindBy(xpath = "//*[@id='a-autoid-0-announce']")
    public WebElement sigin;
    @FindBy(xpath = "//input[@id='ap_email']")//*[@id='ap_email']
    public WebElement email;
    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement pass;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElement sigin2;
    @FindBy(xpath = "//*[text()='Create a List']")
    public WebElement createList;
    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement ilksignin;
    @FindBy(xpath = "//*[@id='nav-link-accountList-nav-line-1']")
    public WebElement ustuneGit;
    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    public WebElement bastakiGiris;

    @FindBy(xpath = "//*[@id='continue' and @class='a-button a-button-span12 a-button-primary']")
    public WebElement devam;

    @FindBy(xpath = "//*[text()='Hello, YILMAZ']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()='Account & Lists']")
    public WebElement createIcinUstuneGit;
    @FindBy(xpath = "//input[@class='a-button-input']")
    public WebElement createlist2;
    @FindBy(xpath = "//span[text()='Shopping List']")
    public WebElement createlist2gorundu;
    @FindBy(xpath = "(//input[@class='a-button-input a-declarative' and @type='submit'])[3]")
    public WebElement yineCreate;
    @FindBy(xpath = "//input[@id='list-name']")
    public WebElement listeAdi;

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement kategoriKutusu;

    @FindBy(xpath = "//*[@class='s-pagination-item s-pagination-button' and text()='2']")
    public WebElement ikinciSayfa;

    @FindBy(xpath = "(//*[@class='a-section aok-relative s-image-square-aspect'])[2]")
    public WebElement ikinciUrun;



}
