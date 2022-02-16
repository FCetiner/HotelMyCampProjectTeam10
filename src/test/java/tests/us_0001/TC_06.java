package tests.us_0001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_06 extends TestBaseRapor {
    //TC_06-Our rooms bolumu gorunur olmali ve kullaniciyi oda ile ilgili bilgilerin oldugu sayfaya yonlendirebilmeli

    @Test
    public void test(){
        HMCPage hmcPage=new HMCPage();
        //1-kullanici url'e gider
        hmcPage.anasayfaGiris();

        //2-Sayfada aşagi gider
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageOurRoomsTitleWebElement);

        ReusableMethods.waitFor(5);

        //3-Our rooms yazisi gorunur

        Assert.assertTrue(hmcPage.mainPageOurRoomsTitleWebElement.isDisplayed());

        //3-ViewRoomDetail tiklar
        hmcPage.mainPageViewRoomDetailsWebElementList.get(1).click();
        //4-Room özellikleri bulunan sayfaya gider
        //
        System.out.println();
    }


}
