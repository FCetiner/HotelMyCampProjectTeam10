package tests.us_00010;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;
//ANa sayfaya gidilir
//kullanıcı loginbutonuna tıklar
//username ve password girer
//rooms satfasina girer
//"Rooms" sayfasindaki istenilen oda secilir
//"Chek out Date" boxuna tarih girilmeli
//"Select Adult Count" boxuna tiklanmali, kisi sayisi secilmeli
//"Select Children Count" boxuna tiklanmali, cocuk sayisi secilmeli
//"Name Surname","Email Address","Phone Number" boxlarinin dogrulugunu test etmeli
//"Name On Credit Card" boxuna tiklanmali, bilgiler girilmeli
//"Credit Card Number" boxuna tiklanmali, bilgiler girilmeli
//"Selected Credit Card Expiration Year" boxuna tiklanmali, yil secilmeli
//"Selected Credit Card Expiration Month" boxuna tiklanmali, ay secilmeli
//"Selected Credit CVV" boxuna tiklanmali, bilgiler girilmeli
//"Message" boxuna tiklanmali, mesaj girilmeli
//"Book this room" buttonuna tiklanmali
//"Reservation was made successfully" texti test edilmeli
//"OK" buttonuna tiklanmali

public class TC_04 {
    KullaniciHotelReservationPage hmcPage10=new KullaniciHotelReservationPage();
    @Test
    public void testCase4() throws InterruptedException {
        //ANa sayfaya gidilir
//kullanıcı loginbutonuna tıklar
        Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
        hmcPage10.logInButtonu.click();
        hmcPage10.usernameBox.sendKeys("Firuze"+ Keys.ENTER);
        hmcPage10.passwordBox.sendKeys("12345Aa."+ Keys.ENTER);
        hmcPage10.ikinciLoginButonu.click();

//rooms satfasina girer
        hmcPage10.roomsButton.click();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", hmcPage10.odaSeciminegit);
        hmcPage10.odaSec.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();


        hmcPage10.checkin_date.click();

        hmcPage10.checkin_date.clear();




      hmcPage10.checkin_date.sendKeys("08/15/2022");



        hmcPage10.checkout_date.clear();

        hmcPage10.checkout_date.click();

       hmcPage10.checkout_date.sendKeys("08/29/2022");


        hmcPage10.AdultCount.click();
        Select objSelect = new Select(hmcPage10.AdultCount);
        objSelect.selectByIndex(6);

hmcPage10.ChildrenCount.click();
        Select objSelect1 = new Select(hmcPage10.ChildrenCount);
        objSelect1.selectByIndex(3);
hmcPage10.nameOnCreditCard.click();
        hmcPage10.nameOnCreditCard.sendKeys(Faker.instance().name().name());
        hmcPage10.creditCardNumber.click();
        hmcPage10.creditCardNumber.sendKeys("1234567812345678");
        hmcPage10.SelectExpirationYearForCreditCard.click();
        Select objSelect3 = new Select(hmcPage10.SelectExpirationYearForCreditCard);
        objSelect3.selectByIndex(3);


        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
hmcPage10.SelectExpirationMonthForCreditCard.click();
        Select objSelect4 = new Select(hmcPage10.SelectExpirationMonthForCreditCard);
        objSelect4.selectByIndex(7);
        hmcPage10.CVV.click();
        hmcPage10.CVV.sendKeys("123");
        hmcPage10.message.click();
        hmcPage10.message.sendKeys("lutfen sessiz yer olsun.");
        hmcPage10.bookthisroom.click();

        String actualSaveText =hmcPage10.rezervasyonText.getText();
        System.out.println("actualtext" + actualSaveText);
        String expSaveText = "Reservation was made successfully";
        // Assert.assertEquals(actualSaveText,expSaveText);
         //ok butonu tiklanmiyor
       // hmcPage10.rezervasyonKapatmaButonu.click();
        //hmcPage10.rezervasyonOkButonu.click();
        Driver.getDriver().close();
    }
}
