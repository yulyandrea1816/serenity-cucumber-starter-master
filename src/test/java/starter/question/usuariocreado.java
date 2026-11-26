package starter.question;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.crearusuariopage;
import starter.ui.home;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class usuariocreado  implements Question<Boolean> {
    private final String detalle;

    public usuariocreado(String detalle){
        this.detalle = detalle;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(crearusuariopage.detalle, isVisible()).forNoMoreThan(30).seconds(),
                Ensure.that(crearusuariopage.detalle).isDisplayed(),
                Ensure.that(crearusuariopage.detalle).text().contains(detalle)
        );
        return true;
    }

    public static usuariocreado creacionExitosa(String detalle) {

        return new usuariocreado(detalle);
    }



}
