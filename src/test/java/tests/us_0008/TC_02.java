package tests.us_0008;

import org.testng.annotations.Test;
import pages.HMCPage;

public class TC_02 {

    @Test
    public void yoneticiGirisTesti (){
        HMCPage hmcPage =new HMCPage();
        hmcPage.girisYap();

}
}