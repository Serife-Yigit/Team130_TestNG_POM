package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class TestOtomasyonPage {

    public WebElement ayDropdownMenu;
    public WebElement yilDropdownMenu;
    public WebElement gunDropdownMenu;

    public  TestOtomasyonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /*
    Page claslari locate yapmak ve varsa login islemi gibi calistigimiz
     sayfaya ozel fonksiyonlara ait basit method olusturmak icin kullanilir

Page class larinin en buyuk ozelligi driver.findElement methodlai yerine @FindBy
kullanilir*/

    @FindBy(id = "global-search")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//a[@class='e-cart'])[1]")
    public WebElement accountlinki;

    @FindBy(xpath = "//input[@id='email']")
     public WebElement emailKutusu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@id='submitlogin']")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[text()='Logout']")
    public WebElement logoutButonu;


    @FindBy(xpath = "//*[@*='puroduct-box my-2  py-1']")
    public List<WebElement> bulunanUrunElementlerListesi;

    @FindBy(xpath = "//div[@class=' heading-sm mb-4']")
    public WebElement urunSayfasindaUrunIsimElenmenti;
}

