@smoke
Feature: Registro de cliente en Mercado Libre

  @smokeA
  Scenario: Alta de cliente nuevo A
    Given que Jesus no es usuario de Mercadolibre
    When accede a la opción de apertura cuenta
    And ingresa su nombre: "Jesus"
    And ingresa su apellido: "Quispe"
    And selecciona tipo de documento DNI
    And ingresa su numero de documento: "88778894"
    And ingresa su email: "cquispe@mails.com"
    And ingresa su password: "112233"
    And acepta terminos
    And selecciona el boton continuar
    Then valida el mensaje de confirmación

  @smokeB
  Scenario: Alta de cliente nuevo B
    Given que Jesus no es usuario de Mercadolibre
    When accede a la opción de apertura cuenta
    And ingresa su nombre: "Jesus"
    And ingresa su apellido: "Quispe"
    And selecciona tipo de documento CE
    And ingresa su numero de documento: "88778894"
    And ingresa su email: "cquispe@mails.com"
    And ingresa su password: "112233"
    And acepta terminos
    And selecciona el boton continuar
    Then valida el mensaje de confirmación


  @smokeC
  Scenario: Alta de cliente nuevo C
    Given que Jesus no es usuario de Mercadolibre
    When el se da de alta como cliente nuevo tabla
      | name  | lastName | document | email             | password |
      | Jesus | Quispe   | 12345678 | cquispe@mails.com | 1122556  |
    And acepta terminos
    And selecciona el boton continuar
    Then valida el mensaje de confirmación

  @smokeD
  Scenario: Alta de cliente nuevo D
    Given que Jesus no es usuario de Mercadolibre
    When el se da de alta como cliente nuevo
    Then valida el mensaje de confirmación


