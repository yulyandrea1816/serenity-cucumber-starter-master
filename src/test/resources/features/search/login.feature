@all
Feature: Login en la página web Orange

  @ValidCredentials
  Scenario Outline: Inicio de sesión

    Given "User" abre la página web
    When Credenciales "<usuario>" y "<password>"
    Then Inicio de sesion exitoso "<mensajeEsperado>"
    Examples:
      | usuario      | password      | mensajeEsperado   |
      | Admin        | admin123      | Dashboard         |