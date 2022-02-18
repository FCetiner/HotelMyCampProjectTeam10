package tests.us_0002;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.ConfigReader;

public class TC_003 {
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

    }
    @Test
    public void yanlisPasswordTest(){

        hmcPage.anasayfaGiris();
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hmcPage.loginButonu.click();
        softAssert.assertTrue( hmcPage.girisYapilamadiYazisi.isDisplayed(),"Yaniş password");
    }
    @Test
    public void yanlisUserPasswordTest(){

        hmcPage.anasayfaGiris();
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hmcPage.loginButonu.click();
        softAssert.assertTrue( hmcPage.girisYapilamadiYazisi.isDisplayed(),"Yaniş username, yanliş password");
        softAssert.assertAll();
    }
}
