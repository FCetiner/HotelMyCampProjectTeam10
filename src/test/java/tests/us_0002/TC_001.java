package tests.us_0002;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001 {
    //1-Yönetici olarak url' e gider
    //2-Yönetici anasayfadaki HOTELMYCAMP webelementini görür
    //3-Yönetici anasayfadaki home webelementini görür
    //4-Yönetici anasayfadaki romms webelementini görür
    //5-Yönetici anasayfadaki restaurant webelementini görür
    //6-Yönetici anasayfadaki about webelementini görür
    //7-Yönetici anasayfadaki blog webelementini görür
    //8-Yönetici anasayfadaki contact webelementini görür
    //9-Yönetici anasayfadaki login in webelementini görür


    @Test
    public void anasayfaTesti(){
        Page page=new Page();
        page.anasayfaGiris();
        Assert.assertTrue(page.hotelMyCampYazisi.isDisplayed());

        for (int i = 0; i < page.anasayfadakiWebElementler.size(); i++) {
            Assert.assertTrue(page.anasayfadakiWebElementler.get(i).isDisplayed());
        }
        Assert.assertTrue(page.anasayfaLogin.isDisplayed());
    }

}
