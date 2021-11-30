import org.junit.Test;
import org.openqa.selenium.By;
import com.codeborne.selenide.selector.ByText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class FirstTest {
    @Test
    public void userCanSearchKeywordWithGoogle(){
        open("http://automationpractice.com/index.php");
        $("a.login").click();
        $("input#email_create").setValue("tastus@gmail.com");
        $(ByText("Create an account")).click();
        sleep (5000);

             //   .setValue("Selenide").pressEnter();

    }

}
