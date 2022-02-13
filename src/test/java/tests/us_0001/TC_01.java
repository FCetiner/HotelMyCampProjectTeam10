package tests.us_0001;

import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {
    @Test
    public void test() {
        HMCPage hmcPage=new HMCPage();
        hmcPage.anasayfaGiris();
    }
}
