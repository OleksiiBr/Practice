package PageObject;

import static com.codeborne.selenide.Selenide.$;

public class FillRegister {
    public void FirstStep(String email) {
        $("input#email_create").setValue(email).pressEnter();
    }
    public void SecondStepRequiredPersonal(String firstName, String lastName, String password){
        $("input#customer_firstname").setValue(firstName);
        $("input#customer_lastname").setValue(lastName);
        $("input#passwd").setValue(password);
    }

    public void SecondStepRequiredAddress(String firstName, String lastName, String address, String city, int state,
                                  String zip, String mobilePhone) {
        $("input#firstname").setValue(firstName);
        $("input#lastname").setValue(lastName);
        $("input#address1").setValue(address);
        $("input#city").setValue(city);
        $("select#id_state").selectOption(state);
        $("input#postcode").setValue(zip);
        $("input#phone_mobile").setValue(mobilePhone);
    }

    //Not required fields
    public void SecondStepUnRequiredGender(Boolean mister){
        if (mister) $("input#id_gender1").click();
            else $("input#id_gender2").click();
    }

    public void FinishRegister() {
        $("button#submitAccount").click();
    }



}
