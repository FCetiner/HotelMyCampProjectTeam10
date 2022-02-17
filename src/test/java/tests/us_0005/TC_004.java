package tests.us_0005;

import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelListPage;

public class TC_004 {
   @Test
   public void test(){
       HMCPage hmcPage = new HMCPage();
       HotelListPage hotelListPage = new HotelListPage();
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

       //Search buttonu tiklayin
       //Degistirilen Hotel billgilerini kontrol edin
   }

}
