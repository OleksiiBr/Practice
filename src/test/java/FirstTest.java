import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;


public class FirstTest {
    @Test
    public void UserRegister(){
        open("http://automationpractice.com/index.php");
        $("a.login").click();
        $("input#email_create").setValue("tastus@gmail.com").pressEnter();
        sleep (2000);
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
        sleep (20000);
    }
}
