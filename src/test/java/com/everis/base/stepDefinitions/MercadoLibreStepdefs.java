package com.everis.base.stepDefinitions;

import com.everis.base.task.MercadoLibreCristian.BuscarProducto;
import com.everis.base.task.mercadoLIbre.NavigateToML;
import com.everis.base.task.mercadoLIbre.actions.SelectBuscar;
import com.everis.base.task.mercadoLIbre.actions.SelectPrimerProduct;
import com.everis.base.task.mercadoLIbre.actions.WriteLastName;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MercadoLibreStepdefs {
    @Given("que soy {actor} e ingreso a Mercadolibre")
    public void queSoyClienteEIngresoAMercadolibre(Actor actor) {
        actor.wasAbleTo(NavigateToML.theMercadoLibrePage());


    }

    @When("ingreso un {string} en el buscador")
    public void ingresoUnEnElBuscador(String producto) {
        theActorInTheSpotlight().attemptsTo(
                BuscarProducto.withData(producto));
    }

    @And("selecciona el boton buscar")
    public void seleccionaElBotonBuscar() {
        theActorInTheSpotlight().attemptsTo(
                new SelectBuscar());

    }

    @And("ingreso en el primer producto")
    public void ingresoEnElPrimerProducto() {
        theActorInTheSpotlight().attemptsTo(
                new SelectPrimerProduct());
    }
}
