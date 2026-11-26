package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.crearusuariopage;
import starter.ui.loginpage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class crearusuario implements Task {

    private final String nombre;
    private final String snombre;
    private final String apellido;

    public crearusuario(String nombre, String snombre, String apellido) {
        this.nombre = nombre;
        this.snombre = snombre;
        this.apellido = apellido;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.nombre).into(crearusuariopage.nombre),
                Enter.theValue(this.snombre).into(crearusuariopage.snombre),
                Enter.theValue(this.apellido).into(crearusuariopage.apellido),
                Click.on(crearusuariopage.guardar)
        );
    }

    public static crearusuario datos(String nombre, String snombre, String apellido) {
        return instrumented(crearusuario.class, nombre, snombre, apellido);
    }
}
