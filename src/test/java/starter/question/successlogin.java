package starter.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.ui.home;

public class successlogin implements Question<Boolean> {
    private final String mensajeEsperado;

    public successlogin(String mensajeEsperado){
        this.mensajeEsperado = mensajeEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(home.DASHBOARD_TEXT).isDisplayed(),
                Ensure.that(home.DASHBOARD_TEXT).text().contains(mensajeEsperado)
        );
        return true;
    }

    public static successlogin loginExitoso(String mensajeEsperado) {

        return new successlogin(mensajeEsperado);
    }

}
