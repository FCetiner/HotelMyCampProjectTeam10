package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_06 extends TestBaseRapor{
    //TC_06-Our rooms bolumu gorunur olmali ve kullaniciyi oda ile ilgili bilgilerin oldugu sayfaya yonlendirebilmeli
    HMCPage hmcPage=new HMCPage();
    @Test
    public void roomReservationSectionTests() {
        extentTest=extentReports.createTest("TC06 Room Reservation testi","Our Rooms Title gorunurlugu ve View Room Detail butonunun ilgili sayfaya yonlendirdigi test edildi");
        hmcPage = new HMCPage();
        //1-kullanici url'e gider
        hmcPage.anasayfaGiris();
        extentTest.info("Anasayfaya gidildi");
        //2-Sayfada aşagi gider
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageOurRoomsTitleWebElement);
        ReusableMethods.waitFor(2);
        //3-Our rooms yazisi gorunur
        Assert.assertTrue(hmcPage.mainPageOurRoomsTitleWebElement.isDisplayed());
        extentTest.info("Our room title basligi goruldu");
        //3-ViewRoomDetail tiklar
        //4-Room özellikleri bulunan sayfaya gider

        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageViewRoomDetailsWebElement1);
        String actualTitle1 = Driver.getDriver().getTitle();
        String expectedWord = "Room detail";
        Assert.assertTrue(actualTitle1.contains(expectedWord));
        Driver.getDriver().navigate().back();
        ReusableMethods.waitForPageToLoad(15);

        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageViewRoomDetailsWebElement2);
        String actualTitle2 = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle2.contains(expectedWord));
        Driver.getDriver().navigate().back();
        ReusableMethods.waitForPageToLoad(15);

        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageViewRoomDetailsWebElement3);
        String actualTitle3 = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle3.contains(expectedWord));
        Driver.getDriver().navigate().back();
        ReusableMethods.waitForPageToLoad(15);

        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageViewRoomDetailsWebElement4);
        String actualTitle4 = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle4.contains(expectedWord));
        Driver.getDriver().navigate().back();
        ReusableMethods.waitForPageToLoad(15);

        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageViewRoomDetailsWebElement5);
        String actualTitle5 = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle5.contains(expectedWord));
        Driver.getDriver().navigate().back();
        ReusableMethods.waitForPageToLoad(15);

        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageViewRoomDetailsWebElement6);
        String actualTitle6 = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle6.contains(expectedWord));
        Driver.getDriver().navigate().back();
        ReusableMethods.waitForPageToLoad(15);
        extentTest.pass("Sayfada bulunan tüm room details butonlari Rooms Details sayfasina yönlendirme yaptigi goruldu");


    }
}
