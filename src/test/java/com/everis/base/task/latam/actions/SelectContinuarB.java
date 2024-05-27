package com.everis.base.task.latam.actions;

import com.everis.base.page.LatamPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectContinuarB implements Task {

    public static SelectContinuarB correctly() {
        return instrumented(SelectContinuarB.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LatamPage.btnContinuarB));
    }
}
