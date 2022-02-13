package tests.us_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_001 extends TestBaseRapor {
    @Test
    public void test() throws IOException {

        HMCPage hmcPage = new HMCPage();
        extentTest = extentReports.createTest("log in", "giris yapildi");
        //Hotel anasayfasina gidin
        // Login butonuna tıklayın
        //geçerli bir username girin
        //geçerli bir password girin
        //Log in  tusuna basin
        hmcPage.yoneticiGirisYap();
        extentTest.pass("Basarili giris yapildi");
        //"manager" yazisinin gorundugunu kontrol edin
        Assert.assertTrue(hmcPage.managerYaziLinki.isDisplayed());
        extentTest.pass("manager yazisi gorunuyor");
        ReusableMethods.waitForVisibility(hmcPage.managerYaziLinki, 2);

        // ReusableMethods.getScreenshot("Giris yapildi");
        extentTest.info("driver kapatildi");
        Driver.closeDriver();


    }

}
