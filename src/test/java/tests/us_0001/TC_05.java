package tests.us_0001;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;



public class TC_05 extends TestBaseRapor {
    HMCPage hmcPage=new HMCPage();
    //US_05-Kullanıcı, 25/7 Front Desk Restaurant Bar Transfer Services Spa Suites logolari gorunur olmali


    @Test
    public void test(){
        hmcPage=new HMCPage();
       //1-kullanici url'e gider
        hmcPage.anasayfaGiris();
        extentTest=extentReports.createTest("TC05_Service Logolarinin gorunurlugu test edildi ","Service ikonlarinin gorunurlugu test edildi");
        extentTest.info("Ana Sayfaya gidildi");
        ReusableMethods.waitForPageToLoad(10);
        //2-Sayfada aşagi gider
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageServiceLogoWebElementListesi.get(1));
        ReusableMethods.waitFor(7);
        extentTest.info("Servis logolarının bulundugu bolume inildi");
        hmcPage.mainPageServiceLogoWebElementListesi.stream().forEach(t-> Assert.assertTrue(t.isDisplayed()));
        extentTest.pass("Servis logolarinin bulundugu goruldu");
    }

}
