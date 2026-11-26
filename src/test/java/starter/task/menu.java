package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.crearusuariopage;
import starter.ui.directorio;

public class menu {
   /* public static Task opcionesmenu() {
        return Task.where("{0} opcionesmenu",
                new Task() {
                    @Override
                    public <T extends Actor> void performAs(T actor) {
                        actor.attemptsTo(
                                Click.on(crearusuariopage.seleccionmenu)
                        );
                    }
                }
        );
    }*/

    public static Task moduloPIM() {
        return Task.where("{0} ingresa al modulo PIM",
                Click.on(crearusuariopage.PIM),
                Click.on(crearusuariopage.agregarusuario)
        );
    }

    public static Task moduloDirectorio(){
        return Task.where("{0} ingreso al modulo directorio",
                Click.on(directorio.directorio));
    }
}
