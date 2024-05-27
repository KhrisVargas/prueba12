package com.everis.base.page;

/**
 * @author jovallep
 */

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.mercadolibre.com.pe/")
public class MercadoLibreCristianPage extends PageObject {

    public static final Target btnCrearCuenta = Target.the("boton crear cuenta")
            .locatedBy("/html/body/header/div/div[1]/nav[2]/a[1]");

    public static final Target textoNombre = Target.the("campo de nombre")
            .located(By.id("firstName"));

    public static final Target textoApellido = Target.the("campo de apellido")
            .located(By.id("lastName"));

    public static final Target tipoDocumento = Target.the("campo de apellido")
            .located(By.name("idType"));

    public static final Target writeDocumento = Target.the("campo de apellido")
            .located(By.id("identification"));

    public static final Target textoCorreo = Target.the("campo de correo")
            .located(By.id("email"));

    public static final Target textoClave = Target.the("campo de password")
            .located(By.id("password"));

    public static final Target checkTerminos = Target.the("check terminos")
            .located(By.id("tyc_checkbox"));

    public static final Target buttonContinuar = Target.the("boton continuar")
            .locatedBy("//*[@id=\"root-app\"]/div/div/form/div[2]/button");

    public static final Target mensajeExito = Target.the("mensaje de registro ok")
            .located(By.id("mensajeOK"));

}
