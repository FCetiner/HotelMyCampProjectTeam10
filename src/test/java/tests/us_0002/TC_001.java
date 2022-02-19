package tests.us_0002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;

public class TC_001 {

    @Test
    public void anasayfaTesti(){
        HMCPage hmcpage=new HMCPage();
        hmcpage.anasayfaGiris();
        Assert.assertTrue(hmcpage.hotelMyCampYazisi.isDisplayed());

        for (int i = 0; i < hmcpage.anasayfadakiWebElementler.size(); i++) {
            Assert.assertTrue(hmcpage.anasayfadakiWebElementler.get(i).isDisplayed());
        }
        Assert.assertTrue(hmcpage.ilkLoginLinki.isDisplayed());
    }

}
