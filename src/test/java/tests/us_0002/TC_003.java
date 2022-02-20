package tests.us_0002;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.TestBaseRapor;

public class TC_003 extends TestBaseRapor {
    HMCPage hmcPage =new HMCPage();
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void yanlisUserNameTesti(){

        hmcPage.anasayfaGiris();
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPage.loginButonu.click();
       softAssert.assertTrue( hmcPage.girisYapilamadiYazisi.isDisplayed(),"Yanliş username");
        extentTest = extentReports.createTest("Yonetici girisi yanlıs username testi","Yonetici yanlis usename ile giris yapamadi");
        extentTest.pass("Yanlis username ile giris yapilamadi");
    }
    @Test
    public void yanlisPasswordTest(){

        hmcPage.anasayfaGiris();
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hmcPage.loginButonu.click();
        softAssert.assertTrue( hmcPage.girisYapilamadiYazisi.isDisplayed(),"Yaniş password");
        extentTest = extentReports.createTest("Yonetici girisi yanlıs password testi","Yonetici yanlis password ile giris yapamadi");
        extentTest.pass("Yanlis password ile giris yapilamadi");

    }
    @Test
    public void yanlisUserPasswordTest(){

        hmcPage.anasayfaGiris();
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hmcPage.loginButonu.click();
        softAssert.assertTrue( hmcPage.girisYapilamadiYazisi.isDisplayed(),"Yaniş username, yanliş password");
        extentTest = extentReports.createTest("Yonetici girisi yanlıs username ve password testi","Yonetici yanlis usename ve password ile giris yapamadi");
        extentTest.pass("Yanlis username ve password ile giris yapilamadi");
        softAssert.assertAll();
    }
}
