package tests.us_0003;

import org.testng.annotations.Test;
import pages.HMCPage;

public class C02_Mehmet {

    @Test
    public void test() {
        HMCPage hmcPage=new HMCPage();
        hmcPage.anasayfaGiris();
        System.out.println("deneme");
        System.out.println("deneme2");
    }
}