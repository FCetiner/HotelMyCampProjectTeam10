package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HMCPage {
    public HMCPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void anasayfaGiris(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    }


    //Yönetici Giriş yap methodu olusturulacak
    //Kullanici Giriş yao methodu oluşturulacak





}
