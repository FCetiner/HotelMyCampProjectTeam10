package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;
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
        extentTest.info("Dogru username girisi yapildi");
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        extentTest.info("Yanlis password girisi yapildi");
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
        extentTest.info("Yanlis username girisi yapildi");
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        extentTest.info("Dogru password girisi yapildi");
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
        extentTest.info("Yanlis username girisi yapildi");
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        extentTest.info("Yanlis password girisi yapildi");
        hmcPage.loginButonu.click();
        Assert.assertTrue(hmcPage.girisYapilamadiYazisi.isDisplayed());
        extentTest.pass("Yanlis usurname ve password testi pass");

    }
}
