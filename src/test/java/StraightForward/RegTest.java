package StraightForward;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;


public class RegTest {
    @Test
    public void UserRegister(){
        open("http://automationpractice.com/index.php");
        $("a.login").click();
        $("input#email_create").setValue("tastus5@gmail.com").pressEnter();
        $("input#id_gender1").click();
        $("input#customer_firstname").setValue("Tastus");
        $("input#customer_lastname").setValue("Tester");
        $("input#passwd").setValue("123123");
        $("input#firstname").setValue("Tastus");
        $("input#lastname").setValue("Tester");
        $("input#address1").setValue("City bla street bla-bla and appartment la-la-la");
        $("input#city").setValue("Ci-city");
        $("input#postcode").setValue("12345");
        $("select#id_state").selectOption(3);
        $("input#phone_mobile").setValue("12345");
        $("button#submitAccount").click();
        $("a.logout").shouldBe(Condition.visible).shouldHave(Condition.text("Sign out"));
    }
}
