package tests.us_0010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_03 extends TestBaseRapor {

    KullaniciHotelReservationPage kullaniciHotelReservationPage;


    @Test
    public void testCase03() throws InterruptedException {

        extentTest=extentReports.createTest("odalara bakma ve gorunurlugunu test etme","Cikan oda secenekleri tiklayabilmeli ve \"Categories\" text altindaki sonuclari tiklayabilmeli");
        kullaniciHotelReservationPage =new KullaniciHotelReservationPage();

        Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidildi");

       kullaniciHotelReservationPage.roomsButton.click();
        extentTest.info("\"Rooms\" buttonuna tiklanildi");


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();


        kullaniciHotelReservationPage.singleRoom.click();
        extentTest.info("\"single\" buttonuna tiklanildi");
        Assert.assertTrue(kullaniciHotelReservationPage.singleRoom.isEnabled(), "erisilemiyor");
        Driver.getDriver().navigate().back();


        kullaniciHotelReservationPage.doubleRoom.click();
        extentTest.info("\"double\" buttonuna tiklanildi");
        Assert.assertTrue(kullaniciHotelReservationPage.doubleRoom.isEnabled(), "erisilemiyor");
        Driver.getDriver().navigate().back();
       ReusableMethods.waitFor(1);


        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();

        ReusableMethods.waitFor(2);
        kullaniciHotelReservationPage.tribleRoom.click();
        extentTest.info("\"TRİBLE\" buttonuna tiklanildi");
        Assert.assertTrue(kullaniciHotelReservationPage.tribleRoom.isEnabled(), "erisilemiyor");
        Driver.getDriver().navigate().back();
       ReusableMethods.waitFor(1);
         kullaniciHotelReservationPage.quadRoom.click();
        extentTest.info("\"QUAD\" buttonuna tiklanildi");
        Assert.assertTrue(kullaniciHotelReservationPage.quadRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();

        ReusableMethods.waitFor(1);
        Driver.getDriver().navigate().back();
        kullaniciHotelReservationPage.queenRoom.click();
        extentTest.info("\"QUEEN \" buttonuna tiklanildi");
        Assert.assertTrue(kullaniciHotelReservationPage.queenRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN).perform();


        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(1);
        kullaniciHotelReservationPage.kingRoom.click();
        extentTest.info("\"KING\" buttonuna tiklanildi");
        Assert.assertTrue(kullaniciHotelReservationPage.kingRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.waitFor(1);
        Driver.getDriver().navigate().back();
        kullaniciHotelReservationPage.twinRoom.click();
        extentTest.info("\"TWIN\" buttonuna tiklanildi");
        Assert.assertTrue(kullaniciHotelReservationPage.twinRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.waitFor(1);
        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(1);
        kullaniciHotelReservationPage.doubleDoubleRoom.click();
        extentTest.info("\"DOUBLE-DOUBLE\" buttonuna tiklanildi");
        Assert.assertTrue(kullaniciHotelReservationPage.doubleDoubleRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.getDriver().navigate().back();

        ReusableMethods.waitFor(1);
        kullaniciHotelReservationPage.studioRoom.click();
        extentTest.info("\"STUDIO\" buttonuna tiklandi");
        Assert.assertTrue(kullaniciHotelReservationPage.studioRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        extentTest.pass("\"Categories\" text yazisi altindaki oda type'lerinin erisebilirligi kontrol edildi");
        Driver.closeDriver();
  }


}
