package tests.us_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelListPage;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_001 extends TestBaseRapor {
    @Test
    public void test() throws IOException {

        HMCPage hmcPage = new HMCPage();
        HotelListPage hotelListPage=new HotelListPage();
        extentTest = extentReports.createTest("log in", "giris yapildi");
        //Hotel anasayfasina gidin
        // Login butonuna tıklayın
        //geçerli bir username girin
        //geçerli bir password girin
        //Log in  tusuna basin
        hmcPage.girisYap();
        extentTest.pass("Basarili giris yapildi");
        //"manager" yazisinin gorundugunu kontrol edin
        Assert.assertTrue(hotelListPage.managerTextElement.isDisplayed());
        extentTest.pass("manager yazisi gorunuyor");
        ReusableMethods.waitForVisibility(hotelListPage.managerTextElement, 2);

        ReusableMethods.getScreenshot("Giris yapildi");
        extentTest.info("driver kapatildi");
        //Driver.closeDriver();


    }

}
