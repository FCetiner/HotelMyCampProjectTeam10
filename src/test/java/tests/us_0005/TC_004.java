package tests.us_0005;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelListPage;
import utilities.Driver;

public class TC_004 {
   @Test
   public void test(){
       HMCPage hmcPage = new HMCPage();
       HotelListPage hotelListPage = new HotelListPage();
Actions actions = new Actions(Driver.getDriver());
       //Hotel anasayfasina gidin
       // Login butonuna tıklayın
       //geçerli bir username girin
       //geçerli bir password girin
       //Log in  tusuna basin
       hmcPage.girisYap();
       //Hotel Management menüsüne tıklayın
       hmcPage.hotelManagementLinki.click();
       //Hotel List menüsüne tıklayın
       hmcPage.hotelListLinki.click();
       //IDHotel  arama kutusuna IDHotel  no girin
        hotelListPage.searchCodeBox.click();
        hotelListPage.searchCodeBox.sendKeys("161803");

       //Search buttonu tiklayin
        hotelListPage.searchBoxButton.click();


       //Degistirilen Hotel billgilerini kontrol edin
       Assert.assertTrue(hotelListPage.foundedDetailsElement.isDisplayed());



   }

}
