import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class FirstTest {
    @Test
    public void userCanSearchKeywordWithGoogle(){
        open("http://google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $(By.name("q")).setValue("OOO").pressEnter();

    }

}
