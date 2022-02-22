package tests.us_0001;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_03 extends TestBaseRapor {
    //TC_03-Kullanıcı, CHECK-IN DATE, CHECK-OUT DATE, ROOM, CUSTOMER elementlerini update edebilmeli ve
    //Check Availability  butonunu tiklayabilmeli"
    HMCPage hmcPage=new HMCPage();
    @Test
    public void test(){
        hmcPage=new HMCPage();
        extentTest=extentReports.createTest("Room reservation Testi","Room reservation guncelleme yapilabiliyor mu testi");
        //1-kullanici url'e gider
        hmcPage.anasayfaGiris();
        extentTest.info("Anasayfaya gidildi");
        //2-check-in Date bolumunu doldurur
        hmcPage.mainPageCheckInDateBox.sendKeys("2/22/2022");
        extentTest.info("CheckinDate Box dolduruldu");
        //3-check-out Date bolumunu doldurur
        hmcPage.mainPageCheckOutDateBox.sendKeys("5/22/2022");
        extentTest.info("CheckoutDate Box dolduruldu");
        //4-room type secimini yapar
        Select select=new Select(hmcPage.mainPageRoomTypeDropDown);
        Faker faker=new Faker();
        select.selectByIndex(faker.random().nextInt(2,10));
        //5-Adult secimini yapar
        select.selectByIndex(faker.random().nextInt(2,7));
        //6-Check Availability  butonuna tiklar
        hmcPage.mainPageCheckAvailabilityButton.click();
        extentTest.info("Check evailability button tiklandi");
        //kullanici rooms sayfasina yönlendirilmelidir
        String expectedTitle="Hotelmycamp - Rooms";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.pass("Rooms sayfasina yonlendrime yapildi");
    }

}
