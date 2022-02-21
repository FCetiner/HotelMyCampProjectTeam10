package tests.us_0002;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_003 extends TestBaseRapor {
    HMCPage hmcPage =new HMCPage();
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void yanlisUserNameTesti(){
        extentTest = extentReports.createTest("Yonetici girisi yanlıs username testi","Yonetici yanlis usename ile giris yapamadi");
        hmcPage.anasayfaGiris();
        hmcPage.ilkLoginLinki.click();
        extentTest.info("Anasayfa giris yapildi");
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        extentTest.info("Yanlis username girisi yapildi");
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        extentTest.info("Dogru password girisi yapildi");
        hmcPage.loginButonu.click();
       softAssert.assertTrue( hmcPage.girisYapilamadiYazisi.isDisplayed(),"Yanliş username");
        extentTest.pass("Yanlis username ile giris yapilamadi");
    }
    @Test
    public void yanlisPasswordTest(){
        extentTest = extentReports.createTest("Yonetici girisi yanlıs password testi","Yonetici yanlis password ile giris yapamadi");
        hmcPage.anasayfaGiris();
        hmcPage.ilkLoginLinki.click();
        extentTest.info("Anasayfa giris yapildi");
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        extentTest.info("Dogru username girisi yapildi");
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        extentTest.info("Yanlis password girisi yapildi");
        hmcPage.loginButonu.click();
        softAssert.assertTrue( hmcPage.girisYapilamadiYazisi.isDisplayed(),"Yaniş password");
        extentTest.pass("Yanlis password ile giris yapilamadi");

    }
    @Test
    public void yanlisUserPasswordTest(){
        extentTest = extentReports.createTest("Yonetici girisi yanlıs username ve password testi","Yonetici yanlis usename ve password ile giris yapamadi");
        hmcPage.anasayfaGiris();
        hmcPage.ilkLoginLinki.click();
        extentTest.info("Anasayfa giris yapildi");
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        extentTest.info("Yanlis username girisi yapildi");
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        extentTest.info("Yanlis password girisi yapildi");
        hmcPage.loginButonu.click();
        softAssert.assertTrue( hmcPage.girisYapilamadiYazisi.isDisplayed(),"Yaniş username, yanliş password");
        extentTest.pass("Yanlis username ve password ile giris yapilamadi");
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
