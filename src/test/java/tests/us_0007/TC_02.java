package tests.us_0007;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {

    Actions actions;
    HMCPage hmcPage;
    HotelRoomsPage roomsPage;
    /*

      **Step1
      **Kullanıcı url yi girer */


    @Test
    public void test01(){
        actions=new Actions(Driver.getDriver());
        hmcPage =new HMCPage();
        roomsPage=new HotelRoomsPage();
        extentTest=extentReports.createTest("TC_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.anasayfaGiris();
        extentTest.info("Url ye gidildi");
    }

    /* Step 2
      **Geçerli bilgilerle Log-in yapılır
     */
    @Test
    public void test02(){
        hmcPage =new HMCPage();
        roomsPage=new HotelRoomsPage();
        actions=new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("TC_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.girisYap();
        extentTest.info("Gecerli bilgilerle giris yapıldı");
        actions.moveToElement(roomsPage.managerDropDownButton).perform();
        ReusableMethods.waitFor(2);
        roomsPage.logOutButton.click();
    }

}
