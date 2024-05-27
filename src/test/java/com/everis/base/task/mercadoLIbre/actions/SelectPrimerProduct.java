package com.everis.base.task.mercadoLIbre.actions;

import com.everis.base.page.MercadoLibrePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPrimerProduct implements Task {

    public static SelectPrimerProduct button() {
        return instrumented(SelectPrimerProduct.class, "");
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(MercadoLibrePage.BTN_PRIMER_PRODUCTO));
    }
}
