package tests.smokTest;

import org.testng.Assert;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class YoneticiGirisiPozitifTest extends TestBaseRapor {

    public void yoneticigirisYap() {
        HMCPage hmcPage =new HMCPage();
        extentTest=extentReports.createTest("Pozitif smoke test","Yönetici başarili giriş yapabildi");
        hmcPage.anasayfaGiris();
        extentTest.info("Url giriş yapildi");

        hmcPage.ilkLoginLinki.click();
        extentTest.info("İlk login clik yapildi");
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        extentTest.info("Username girişi yapildi");
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        extentTest.info("Password girişi yapildi");
        hmcPage.loginButonu.click();
        Assert.assertTrue(hmcPage.managerDrapDown.isDisplayed());
        extentTest.pass("Yonetici başarili giriş yapabilmiştir");


    }
}
