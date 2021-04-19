package examTest;

import org.testng.Assert;

public class TitlePage extends BasePage {
    public static boolean TitPage (){
        getTitle();
        Assert.assertEquals("Duolingo - Лучший в мире способ учить языки",getTitle());

        return true;
    }

}
