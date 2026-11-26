package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class loginpage {
    private loginpage(){}

    public static final Target USERNAME =Target.the("Usuario")
            .located(By.name("username"));
    public static final Target PASSWORD = Target.the("Contraseña")
            .located(By.name("password"));
    public static final Target SUBMIT_BUTTON =Target.the("login")
            .locatedBy("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button");

}
