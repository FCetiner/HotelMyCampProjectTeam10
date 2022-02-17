package tests.us_00010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_03 {
    KullaniciHotelReservationPage hmcPage10=new KullaniciHotelReservationPage();
    @Test
    public void testCase03() throws InterruptedException {
        //Ana sayfaya gidilir
        //login butonuna tıklanır
        //usernme password girilir logie basilir
        // rooms sayfasına basilir
        //Herhangi bir book now  butonuna tiklanir
        // Sagdaki "Single" katagori sonuclarini kontrol eder
        // Sagdaki "Double" katagori sonuclarini kontrol eder
        // Sagdaki "Trible" katagori sonuclarini kontrol eder
        // Sagdaki "Quad" katagori sonuclarini kontrol eder
        // Sagdaki "Queen" katagori sonuclarini kontrol eder
        // Sagdaki "King" katagori sonuclarini kontrol eder
        // Sagdaki "Twin" katagorisonuclarini kontrol eder
        // Sagdaki "Double-double" katagori sonuclarini kontrol eder
        // Sagdaki "Studio" katagori sonuclarini kontrol eder
            Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
            hmcPage10.logInButtonu.click();
            hmcPage10.usernameBox.sendKeys("Firuze"+ Keys.ENTER);
            hmcPage10.passwordBox.sendKeys("12345Aa."+ Keys.ENTER);
            hmcPage10.ikinciLoginButonu.click();
            hmcPage10.roomsButton.click();


        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        hmcPage10.bookNow8.click();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();
        hmcPage10.singleRoom.click();
        Assert.assertTrue(hmcPage10.singleRoom.isEnabled(),"erisilemiyor");

        Driver.getDriver().navigate().back();
        hmcPage10.doubleRoom.click();
        Assert.assertTrue(hmcPage10.doubleRoom.isEnabled(),"erisilemiyor");
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        hmcPage10.tribleRoom.click();
        Assert.assertTrue(hmcPage10.tribleRoom.isEnabled(),"erisilemiyor");
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        hmcPage10.quadRoom.click();
        Assert.assertTrue(hmcPage10.quadRoom.isEnabled(),"erisilemiyor");
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(1000);

        Driver.getDriver().navigate().back();
        hmcPage10.queenRoom.click();
        Assert.assertTrue(hmcPage10.queenRoom.isEnabled(),"erisilemiyor");
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        hmcPage10.kingRoom.click();
        Assert.assertTrue(hmcPage10.kingRoom.isEnabled(),"erisilemiyor");
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        hmcPage10.twinRoom.click();
            Assert.assertTrue(hmcPage10.twinRoom.isEnabled(),"erisilemiyor");
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();
        hmcPage10.doubleDoubleRoom.click();
        Assert.assertTrue(hmcPage10.doubleDoubleRoom.isEnabled(),"erisilemiyor");
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(1000);

        Driver.getDriver().navigate().back();

        hmcPage10.studioRoom.click();
        Assert.assertTrue(hmcPage10.studioRoom.isEnabled(),"erisilemiyor");
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();

           // Assert.assertTrue(hmcPage10.twinRoom.isEnabled(),"erisilemiyor");
        Thread.sleep(1000);
        Driver.getDriver().close();
    }

}
