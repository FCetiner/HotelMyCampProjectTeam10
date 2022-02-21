package tests.us_0007;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {

    Actions actions=new Actions(Driver.getDriver());
    HMCPage hmcPage =new HMCPage();
    HotelRoomsPage roomsPage=new HotelRoomsPage();
    /*

      **Step1
      **Kullanıcı url yi girer */


    @Test
    public void test01(){

        extentTest=extentReports.createTest("TC_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.anasayfaGiris();
        extentTest.info("Url ye gidildi");
    }

    /* Step 2
      **Geçerli bilgilerle Log-in yapılır
     */
    @Test
    public void test02(){

        extentTest=extentReports.createTest("TC_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.girisYap();
        extentTest.info("Gecerli bilgilerle giris yapıldı");
        actions.moveToElement(roomsPage.managerDropDownButton).perform();
        ReusableMethods.waitFor(2);
        roomsPage.logOutButton.click();
    }

}
