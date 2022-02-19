package tests.us_0007;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;


public class TC_01 {

    HMCPage hmcPage =new HMCPage();
    /*  Yönetici olarak anasayfaya gidebilmeli
     **Kullanıcı url yi girer */

    @Test
    public void test01(){


        hmcPage.anasayfaGiris();
    }

    /*
       ** Log-in butonunun görülür olduğunu kontrol eder  */

    @Test
    public void test02(){
        Assert.assertTrue(hmcPage.ilkLoginLinki.isDisplayed());
    }
}
