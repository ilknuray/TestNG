package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
public AutomationPage(){
    PageFactory.initElements(Driver.getDriver(),this);


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
@FindBy(xpath = "//input[@id='first_name']")
    public WebElement name2;
}
