package tests.smokTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.TestBaseRapor;

public class YoneticiGirisNegativeTest extends TestBaseRapor {

    HMCPage hmcPage =new HMCPage();

    @Test
    public void yanlisUserNameTesti(){


        extentTest=extentReports.createTest("Negatif smoke test","Yönetici yanliş username ile giriş yapilamadi");
        hmcPage.anasayfaGiris();
        extentTest.info("Url' e giriş yapildi");
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPage.loginButonu.click();
        Assert.assertTrue(hmcPage.girisYapilamadiYazisi.isDisplayed());
        extentTest.pass("Yanlis usurname testi pass");
    }
    @Test
    public void yanlisPasswordTest(){

        extentTest=extentReports.createTest("Negatif smoke test","Yönetici yanliş password ile giriş yapilamadi");
        hmcPage.anasayfaGiris();
        extentTest.info("Url' e giriş yapildi");
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hmcPage.loginButonu.click();
        Assert.assertTrue(hmcPage.girisYapilamadiYazisi.isDisplayed());
        extentTest.pass("Yanlis password testi pass");
    }
    @Test
    public void yanlisUserPasswordTest(){

        extentTest=extentReports.createTest("Negatif smoke test","Yönetici yanliş username ve yanlis password ile giriş yapilamadi");
        hmcPage.anasayfaGiris();
        extentTest.info("Url' e giriş yapildi");
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hmcPage.loginButonu.click();
        Assert.assertTrue(hmcPage.girisYapilamadiYazisi.isDisplayed());
        extentTest.pass("Yanlis usurname ve password testi pass");
    }
}
