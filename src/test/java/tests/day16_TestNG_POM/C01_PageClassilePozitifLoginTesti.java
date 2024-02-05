package tests.day16_TestNG_POM;

import org.testng.annotations.Test;
import pages.TestOtomasyonPage;
import utulities.Driver;
import utulities.ReusableMethods;

public class C01_PageClassilePozitifLoginTesti {

    @Test
    public void pozitifLoginTesti(){

        Driver.getDriver().get("https://www.testotomasyonu.com/");

        TestOtomasyonPage testOtomasyonPage = new TestOtomasyonPage();
        ReusableMethods.bekle(3);
        testOtomasyonPage.accountlinki.click();

        ReusableMethods.bekle(5);

        Driver.quitDriver();
    }
}
