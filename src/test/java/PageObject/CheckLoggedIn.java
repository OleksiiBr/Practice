package PageObject;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class CheckLoggedIn {
    public void CheckIfLoggedIn () {
        $("a.logout").shouldBe(Condition.visible).shouldHave(Condition.text("Sign out"));
    }
}
