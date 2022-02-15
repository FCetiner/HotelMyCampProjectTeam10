package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;

public class TC_02 {
    //TC_02-Kullanıcı, arka plandaki resimleri görebilmeli

    @Test
    public void logoGorunuyorMuTesti(){
        HMCPage hmcPage=new HMCPage();
        hmcPage.anasayfaGiris();
        boolean isDisplayed= hmcPage.mainPageHotelMyCampTextWebElement.isDisplayed();
        Assert.assertTrue(isDisplayed);
        Driver.closeDriver();
    }
}
