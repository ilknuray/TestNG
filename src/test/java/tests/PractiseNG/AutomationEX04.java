package tests.PractiseNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationEX04 {
    @Test
    public void test01() {
        //Test Case 4: Logout User
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        AutomationPage automationPage=new AutomationPage();
        Driver.getDriver().get(ConfigReader.getProperty("AtomationExcerciseUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationPage.home.isDisplayed());
        //4. Click on 'Signup / Login' button
        automationPage.login.click();
        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(automationPage.account.isDisplayed());
        //6. Enter correct email address and password
        automationPage.email.sendKeys(ConfigReader.getProperty("AtomationEmail"));
        automationPage.password.sendKeys(ConfigReader.getProperty("AtomationPass"));
        //7. Click 'login' button
        automationPage.signin.click();
        //8. Verify that 'Logged in as username' is visible
        //9. Click 'Logout' button
        //10. Verify that user is navigated to login page
    }
}
