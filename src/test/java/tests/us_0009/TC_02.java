package tests.us_0009;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Us_0009Page;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {
    /*
    1- Yonetici Concort Hotel sayfasina gider.
    2- Yonetici sag üstteki login butonuna tiklar.
    3- Yönetici isim ve password textbox'larina dogru kullanici adi ve sifre girer.
    4- Yönetici login butonuna basar.
    5- Title'in Admin yazisi icerdigini gorur.
*/
    @Test
    public void test() {

        Us_0009Page us_0009Page=new Us_0009Page();
        us_0009Page.HMCLogin();


    }
}
