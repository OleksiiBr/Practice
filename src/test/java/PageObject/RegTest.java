package PageObject;

import org.junit.Test;

public class RegTest {
    @Test
    public void UserCanRegister(){
        new GoToLogin().Go();
        FillRegister fillin = new FillRegister();
        fillin.FirstStep("tastus6@gmail.com");
        fillin.SecondStepRequiredPersonal("tast", "us", "12345");
        fillin.SecondStepRequiredAddress("tast", "us", "Pageobject street, apt 1024","Уездный город N", 3, "16384", "1123581321");
        fillin.SecondStepUnRequiredGender(true);
        fillin.FinishRegister();
        new CheckLoggedIn().CheckIfLoggedIn();
    }
}
