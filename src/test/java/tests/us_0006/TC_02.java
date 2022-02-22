package tests.us_0006;

import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {

    HMCPage hmcPage;

    @Test
    public void test01() {

        hmcPage =new HMCPage();
        extentTest=extentReports.createTest("TC_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
      hmcPage.anasayfaGiris();

        extentTest.info("Url ye gidildi");
        hmcPage.ilkLoginLinki.click();
        extentTest.info("\"Log in\" linkine tiklanildi");
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        extentTest.info("\"UsernameBox\" kutusuna gecerli bir yonetici adi girldi");
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        extentTest.info("\"passwordBox\" kutusuna gecerli bir password girildi");
        hmcPage.loginButonu.click();
        extentTest.info("\"login\" butonuna tiklanildi");
        Driver.closeDriver();
    }


}
