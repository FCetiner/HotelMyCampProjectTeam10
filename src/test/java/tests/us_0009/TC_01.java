package tests.us_0009;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    @Test
    public void homePageTest(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("HMCUrl"));



    }

}
