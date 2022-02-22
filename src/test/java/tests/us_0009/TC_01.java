package tests.us_0009;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {

    @Test
    public void homePageTest(){
        extentTest=extentReports.createTest("Home Page Testi","Homepage Url'i Test edildi.");
        extentTest.info("Anasayfaya gidildi");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("HMCUrl"));

        extentTest.pass("Url kontrolu basarili");



    }

}
