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
    @Test
    public void testCase03() throws InterruptedException {

        extentTest=extentReports.createTest("odalara bakma ve gorunurlugunu test etme","Cikan oda secenekleri tiklayabilmeli ve \"Categories\" text altindaki sonuclari tiklayabilmeli");
        KullaniciHotelReservationPage hmcPage10=new KullaniciHotelReservationPage();

        Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidildi");

       hmcPage10.roomsButton.click();
        extentTest.info("\"Rooms\" buttonuna tiklanildi");


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();


        hmcPage10.singleRoom.click();
        extentTest.info("\"single\" buttonuna tiklanildi");
        Assert.assertTrue(hmcPage10.singleRoom.isEnabled(), "erisilemiyor");
        Driver.getDriver().navigate().back();


        hmcPage10.doubleRoom.click();
        extentTest.info("\"double\" buttonuna tiklanildi");
        Assert.assertTrue(hmcPage10.doubleRoom.isEnabled(), "erisilemiyor");
        Driver.getDriver().navigate().back();
       ReusableMethods.waitFor(1);


        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();

        ReusableMethods.waitFor(1);
        hmcPage10.tribleRoom.click();
        extentTest.info("\"TRİBLE\" buttonuna tiklanildi");
        Assert.assertTrue(hmcPage10.tribleRoom.isEnabled(), "erisilemiyor");
        Driver.getDriver().navigate().back();
       ReusableMethods.waitFor(1);
         hmcPage10.quadRoom.click();
        extentTest.info("\"QUAD\" buttonuna tiklanildi");
        Assert.assertTrue(hmcPage10.quadRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();

        ReusableMethods.waitFor(1);
        Driver.getDriver().navigate().back();
        hmcPage10.queenRoom.click();
        extentTest.info("\"QUEEN \" buttonuna tiklanildi");
        Assert.assertTrue(hmcPage10.queenRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN).perform();


        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(1);
        hmcPage10.kingRoom.click();
        extentTest.info("\"KING\" buttonuna tiklanildi");
        Assert.assertTrue(hmcPage10.kingRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.waitFor(1);
        Driver.getDriver().navigate().back();
        hmcPage10.twinRoom.click();
        extentTest.info("\"TWIN\" buttonuna tiklanildi");
        Assert.assertTrue(hmcPage10.twinRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.waitFor(1);
        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(1);
        hmcPage10.doubleDoubleRoom.click();
        extentTest.info("\"DOUBLE-DOUBLE\" buttonuna tiklanildi");
        Assert.assertTrue(hmcPage10.doubleDoubleRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.getDriver().navigate().back();

        ReusableMethods.waitFor(1);
        hmcPage10.studioRoom.click();
        extentTest.info("\"STUDIO\" buttonuna tiklandi");
        Assert.assertTrue(hmcPage10.studioRoom.isEnabled(), "erisilemiyor");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        extentTest.pass("\"Categories\" text yazisi altindaki oda type'lerinin erisebilirligi kontrol edildi");

  }

}
