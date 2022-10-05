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
    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement pass;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElement sigin2;
    @FindBy(xpath = "//*[@id='createList-announce']")
    public WebElement createList;

}
