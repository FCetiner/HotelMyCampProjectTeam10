package tests.us_0010;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
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

public class TC_04 extends TestBaseRapor {


 @Test
 public void testCase04(){

  extentTest=extentReports.createTest("kullanıcı kalacagi tarihlerde rezerve yapar","\"Book this room\" tiklayarak,\"Reservation was made successfully\" yazisi test edilerek,\"OK\" tiklayabilmeli");
  KullaniciHotelReservationPage hmcPage10=new KullaniciHotelReservationPage();

  Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
  extentTest.info("Url gidildi");
     SoftAssert softAssert=new SoftAssert();

        hmcPage10.logInButtonu.click();
        extentTest.info("\"Log in\" buttonuna tiklanildi");

        hmcPage10.usernameBox.sendKeys("Firuze"+ Keys.ENTER);
        hmcPage10.passwordBox.sendKeys("12345Aa."+ Keys.ENTER);
        hmcPage10.ikinciLoginButonu.click();
        extentTest.info("Kullanici girisi yapti");

        hmcPage10.roomsButton.click();
         extentTest.info("\"Rooms\" buttonuna tiklanildi");

  JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
  jse.executeScript("arguments[0].scrollIntoView(true);", hmcPage10.odaSeciminegit);
     extentTest.info("oda secimine gidildi");
  ReusableMethods.waitFor(5);
  hmcPage10.odaSec.click();
  extentTest.info("Triple odasi secildi.");

  Actions actions=new Actions(Driver.getDriver());
  actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

   ReusableMethods.waitFor(5);
    hmcPage10.checkin_date.click();
     extentTest.info("checkin_date buttonuna tiklandi");
   hmcPage10.checkin_date.clear();
 hmcPage10.checkin_date.sendKeys("08/15/2022");

         hmcPage10.checkout_date.clear();
         hmcPage10.checkout_date.click();
         extentTest.info("checkout_date buttonuna tiklandi");
          hmcPage10.checkout_date.sendKeys("08/29/2022");


  hmcPage10.AdultCount.click();
     extentTest.info("Adult Count buttonuna tiklandi");
  Select objSelect = new Select(hmcPage10.AdultCount);
  objSelect.selectByIndex(6);

  hmcPage10.ChildrenCount.click();
     extentTest.info("Children Count buttonuna tiklandi");
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
  hmcPage10.message.sendKeys("sessiz yer olsun.");
  hmcPage10.bookthisroom.click();
  extentTest.info("\"Book this room\" buttonuna tiklanildi");

  softAssert.assertTrue(hmcPage10.reservationsTextStr.isDisplayed());
  extentTest.pass("\"Reservation was made successfully\" text gorulmesi gerekirken gorulemedi");

 hmcPage10.rezervasyonOkButonu.click();
  extentTest.info("Reservasition yapildiktan sonra \"OK\" buttonuna tiklanildi");
  softAssert.assertTrue(hmcPage10.reservationsButton.isEnabled());
     extentTest.pass("ok butonuna tiklanmadi ama ana sayfaya yonlendirdigim icin tiklandi gozukuyor");

  Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
   hmcPage10.logOut.click();
   softAssert.assertAll();
 }}

