package starter.stepdefinitions.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.question.successlogin;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class logindefinitions {

    @Given("{string} abre la página web")
    public void abreLaPaginaWeb(String actor) {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(actor).attemptsTo(
                Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        );
    }

    @When("Credenciales {string} y {string}")
    public void Credenciales (String username, String password) {
        OnStage.withCurrentActor(starter.task.login.conCredenciales(username, password));
        theActorInTheSpotlight().remember("password", password);
    }

    @Then("Inicio de sesion exitoso {string}")
    public void Iniciodesesionexitoso (String mensajeEsperado) {
        theActorInTheSpotlight().should(seeThat(successlogin.loginExitoso(mensajeEsperado)));
    }

}

