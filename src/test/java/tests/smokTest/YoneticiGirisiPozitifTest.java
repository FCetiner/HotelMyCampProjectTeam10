package tests.smokTest;

import org.testng.Assert;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;

public class YoneticiGirisiPozitifTest {

    public void yoneticigirisYap() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HMCPage hmcPage =new HMCPage();
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPage.loginButonu.click();
        Assert.assertTrue(hmcPage.managerDrapDown.isDisplayed());

    }
}
