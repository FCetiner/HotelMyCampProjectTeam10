package tests.us_0001;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.JSUtils;

public class TC_10 {
    //TC10-Instagram fotograflari gorunebilir olmali
    @Test
    public void test(){
        HMCPage hmcPage=new HMCPage();
        hmcPage.anasayfaGiris();
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageInstagramFotograflari1);

        Assert.assertTrue(hmcPage.mainPageInstagramFotograflari1.isDisplayed());
        Assert.assertTrue(hmcPage.mainPageInstagramFotograflari2.isDisplayed());
        Assert.assertTrue(hmcPage.mainPageInstagramFotograflari3.isDisplayed());
        Assert.assertTrue(hmcPage.mainPageInstagramFotograflari4.isDisplayed());

    }
}
