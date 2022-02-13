package tests.us_0002;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.HMCPage;

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
HMCPage hmcPage =new HMCPage();
    @Test
    public void test(){
       hmcPage.anasayfaGiris();
    }
    @FindBy (xpath = "(//a[@class='nav-link'])[7]")
    public WebElement anasayfaLogin;

}
