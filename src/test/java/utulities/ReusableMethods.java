package utulities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {

    public static void bekle(int saniye){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<String>stringslisteCevir(List<WebElement> webElementList){

        List<String> stringList = new ArrayList<>();
        for (WebElement eachtElement : webElementList
        ){
            stringList.add(eachtElement.getText());
        }

        return stringList;
    }
}
