package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.JSUtils;

public class TC_08 {
    //TC_08-Misafir yorumlari bolumu gorunur olmali

    @Test
    public void test(){
        //1-kullanici url'e gider
        HMCPage hmcPage=new HMCPage();
        hmcPage.anasayfaGiris();
        JSUtils.scrollIntoVIewJS(hmcPage.mainPagemisafirYorumlariWebElemet);
        Assert.assertTrue(hmcPage.mainPagemisafirYorumlariWebElemet.isDisplayed());

    }
}
