package tests.us_0001;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class TC_10 {
    //TC10-Instagram fotograflari gorunebilir olmali
    @Test
    public void test(){
        HMCPage hmcPage=new HMCPage();
        hmcPage.anasayfaGiris();
        JSUtils.scrollIntoVIewJS(hmcPage.mainPagesectionInstagram);
        ReusableMethods.waitFor(3);
        hmcPage.mainPageInstagramFotograflarListesi.stream().forEach(t-> Assert.assertTrue(t.isDisplayed()));
        Driver.closeDriver();

    }
}
