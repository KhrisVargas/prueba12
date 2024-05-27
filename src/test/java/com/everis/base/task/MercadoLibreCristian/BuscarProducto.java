package com.everis.base.task.MercadoLibreCristian;

import com.everis.base.page.MercadoLibrePage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task {

    private final String producto;

    public BuscarProducto(String producto){
        this.producto = producto;
    }

    public static Performable withData(String producto){
        return instrumented(BuscarProducto.class, producto);
    }

    @Override
    @Step("{0} envia datos")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(producto).into(MercadoLibrePage.INP_PRODUCTO));

    }
}
