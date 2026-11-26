package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.question.usuariocreado;
import starter.task.menu;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class empleadosdefinitions {

    @When("ingresa al modulo PIM")
    public void ingresaalmoduloPIM () {
        theActorInTheSpotlight().wasAbleTo(
                //menu.opcionesmenu(),
                menu.moduloPIM()
        );
    }

    @And("agrega un nuevo empleado {string} y {string} y {string}")
    public void agregaunnuevoempleado (String nombre,String snombre, String apellido){
        OnStage.withCurrentActor(starter.task.crearusuario.datos(nombre, snombre, apellido));
    }

    @Then("deberia ver el registro exitoso del empleado {string}")
    public void deberiaverelregistroexitosodelempleado (String detalle) {
        theActorInTheSpotlight().should(seeThat(usuariocreado.creacionExitosa(detalle)));
    }
}
