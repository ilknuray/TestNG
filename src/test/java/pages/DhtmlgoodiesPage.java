package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DhtmlgoodiesPage {

  public   DhtmlgoodiesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "box6")
    public WebElement italy;

    @FindBy(id = "box1")
    public WebElement oslo;

    @FindBy(id ="box7" )
    public WebElement madrid;

    @FindBy(id = "box5")
    public WebElement seul;

    @FindBy(id = "box4")
    public WebElement kopenhag;

    @FindBy(id = "box3")
    public WebElement washington;

    @FindBy(id = "box2")
    public WebElement stockholm;

    @FindBy(id = "box106")
    public WebElement rome;

    @FindBy(id = "box107")
  public WebElement spain;

    @FindBy(id = "box101")
  public WebElement norwey;

    @FindBy(id = "box104")
  public WebElement denmark;

    @FindBy(id = "box105")
  public WebElement soutKorea;

    @FindBy(id = "box102")
  public WebElement sweden;

    @FindBy(id = "box103")
  public WebElement unitedState;

}
