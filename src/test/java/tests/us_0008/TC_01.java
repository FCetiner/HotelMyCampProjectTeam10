package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.TestBaseRapor;

public class TC_01  {

    @Test
    public void anasayfaGirisTesti(){
        HMCPage hmcPage=new HMCPage();
        hmcPage.anasayfaGiris();
        Assert.assertTrue(hmcPage.hotelMyCampYazisi.isDisplayed());

}
}
