package PageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoToLogin {
    public void Go() {
        open("http://automationpractice.com/index.php");
        $("a.login").click();
    }
}
