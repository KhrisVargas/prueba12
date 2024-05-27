@MERCADO_LIBRE
Feature: Busco un producto en la pagina de MERCADO LIBRE

  @BUSCAR_PRODUCTO
  Scenario: Buscar producto en la pagina mercado libre
    Given que soy cliente e ingreso a Mercadolibre
    When  ingreso un "televisor" en el buscador
    And   selecciona el boton buscar
    And   ingreso en el primer producto