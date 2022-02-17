package tests.us_00010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TC_05 {
    KullaniciHotelReservationPage hmcPage10=new KullaniciHotelReservationPage();
    @Test
    public void testCase5() throws IOException {
        //        Kullanici ana sayfaya gider
        //login butonuna tıklar
        //"User Menu" texti altindaki "Reservations" buttonu tiklar
        //onların görülebildigini test eder

        Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
        hmcPage10.logInButtonu.click();
        hmcPage10.usernameBox.sendKeys("Firuze"+ Keys.ENTER);
        hmcPage10.passwordBox.sendKeys("12345Aa."+ Keys.ENTER);
        hmcPage10.ikinciLoginButonu.click();

        Actions actions=new Actions(Driver.getDriver());
        hmcPage10.bosAlan.click();
        actions.sendKeys(Keys.HOME);

        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("sayfanin en ustune cikildi");


    }
}
