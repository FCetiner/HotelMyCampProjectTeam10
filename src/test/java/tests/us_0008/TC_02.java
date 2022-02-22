package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {
    HMCPage hmcPage=new HMCPage();
    @Test
    public void yoneticiGirisTesti (){
        hmcPage =new HMCPage();
        hmcPage.yoneticigirisYap();
        Assert.assertTrue(hmcPage.managerDrapDown.isDisplayed());
        extentTest=extentReports.createTest("Yonetici giris testi","Yonetici basarili giris yapabildi");
        extentTest.pass("Yonetici basarili giris yapabildi");
        hmcPage.anasayfaGiris();
        hmcPage.loginOutElementi.click();
}
}
