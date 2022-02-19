package tests.us_0008;

import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {

    @Test
    public void anasayfaGirisTesti(){
        HMCPage hmcPage=new HMCPage();
        hmcPage.anasayfaGiris();

}
}
