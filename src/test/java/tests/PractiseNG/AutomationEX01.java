package tests.PractiseNG;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationEX01 {
    @Test
    public void test() {
        //Test Case 1: Register User
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        AutomationPage automationPage=new AutomationPage();

        Driver.getDriver().get(ConfigReader.getProperty("AtomationExcerciseUrl"));

        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationPage.home.isDisplayed());

        //4. Click on 'Signup / Login' button
        automationPage.login.click();

        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(automationPage.newUser.isDisplayed());

        //6. Enter name and email address
        automationPage.name.sendKeys("ilknur");
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        automationPage.email.sendKeys(faker.internet().emailAddress());

        //7. Click 'Signup' button
        automationPage.signin.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(automationPage.account.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        automationPage.gender.click();
        automationPage.password.sendKeys("12345");
        actions.sendKeys(Keys.TAB).sendKeys("10").sendKeys(Keys.TAB).sendKeys("May").sendKeys(Keys.TAB).sendKeys("1985")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys("team13")
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB).sendKeys("Canada").sendKeys(Keys.TAB).sendKeys(faker.address().state()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(automationPage.hesapOlustu.isDisplayed());
        //15. Click 'Continue' button
        automationPage.devam.click();
        //16. Verify that 'Logged in as username' is visible
        String user=automationPage.ilknur.getText();
        Assert.assertTrue(user.contains("ilknur"));

        //17. Click 'Delete Account' button
        automationPage.delete.click();
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        automationPage.silindiMi.click();
        Driver.closeDriver();
    }
}
