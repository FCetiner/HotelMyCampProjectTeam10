package tests.smokTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.ConfigReader;

public class YoneticiGirisNegativeTest {
    HMCPage hmcPage =new HMCPage();
    @Test
    public void yanlisUserNameTesti(){


        hmcPage.anasayfaGiris();
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPage.loginButonu.click();
        Assert.assertTrue(hmcPage.girisYapilamadiYazisi.isDisplayed());

    }
    public void yanlisPasswordTest(){

        hmcPage.anasayfaGiris();
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hmcPage.loginButonu.click();
        Assert.assertTrue(hmcPage.girisYapilamadiYazisi.isDisplayed());

    }
    public void yanlisUserPasswordTest(){

        hmcPage.anasayfaGiris();
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hmcPage.loginButonu.click();
        Assert.assertTrue(hmcPage.girisYapilamadiYazisi.isDisplayed());

    }
}
