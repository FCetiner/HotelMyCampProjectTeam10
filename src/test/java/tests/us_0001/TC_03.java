package tests.us_0001;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {
    //TC_03-Kullanıcı, CHECK-IN DATE, CHECK-OUT DATE, ROOM, CUSTOMER elementlerini update edebilmeli ve
    //Check Availability  butonunu tiklayabilmeli"

    @Test
    public void test(){
        HMCPage hmcPage=new HMCPage();
        //1-kullanici url'e gider
        hmcPage.anasayfaGiris();
        //2-check-in Date bolumunu doldurur
        hmcPage.mainPageCheckInDateBox.sendKeys("2/22/2022");
        //3-check-out Date bolumunu doldurur
        hmcPage.mainPageCheckOutDateBox.sendKeys("5/22/2022");
        //4-room type secimini yapar
        Select select=new Select(hmcPage.mainPageRoomTypeDropDown);
        Faker faker=new Faker();
        select.selectByIndex(faker.random().nextInt(2,10));
        //5-Adult secimini yapar
        select.selectByIndex(faker.random().nextInt(2,7));
        //6-Check Availability  butonuna tiklar
        hmcPage.mainPageCheckAvailabilityButton.click();
        //kullanici rooms sayfasina yönlendirilmelidir
        String expectedTitle="Hotelmycamp - Rooms";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.closeDriver();
    }

}
