package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.loginpage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class login implements Task {

    private final String username;
    private final String password;


    public login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.username).into(loginpage.USERNAME),
                Enter.theValue(this.password).into(loginpage.PASSWORD),
                Click.on(loginpage.SUBMIT_BUTTON)
        );
    }

    public static login conCredenciales(String username, String password) {
        return instrumented(login.class, username, password);
    }
}
