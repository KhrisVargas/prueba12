package com.everis.base.questions.latam;

import com.everis.base.page.LatamPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TarifaMenu implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LatamPage.lblMenu.resolveFor(actor).getText();
    }

    public static TarifaMenu getText() {
        return new TarifaMenu();
    }
}
