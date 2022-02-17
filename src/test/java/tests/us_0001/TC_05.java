package tests.us_0001;


public class TC_05 {

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_05 extends TestBaseRapor {

    //US_05-Kullanıcı, 25/7 Front Desk Restaurant Bar Transfer Services Spa Suites logolari gorunur olmali


    @Test
    public void test(){
        HMCPage hmcPage=new HMCPage();
       //1-kullanici url'e gider
        hmcPage.anasayfaGiris();
        extentTest.info("Ana Sayfaya gidildi");
        ReusableMethods.waitForPageToLoad(10);
        //2-Sayfada aşagi gider
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageServiceLogoWebElementListesi.get(1));
        ReusableMethods.waitFor(7);
        extentTest.info("Servis logolarının bulundugu bolume inildi");
        hmcPage.mainPageServiceLogoWebElementListesi.stream().forEach(t-> Assert.assertTrue(t.isDisplayed()));
        extentTest.pass("Servis logolarinin bulundugu goruldu");
        Driver.closeDriver();
    }



    
}
