@all
Feature: Gestión de empleados en el módulo PIM

  Background:
    Given "User" abre la página web
    And Credenciales "Admin" y "admin123"


  @AgregarEmpleado
  Scenario Outline: Agregar un nuevo empleado con foto de perfil
    When ingresa al modulo PIM
    And agrega un nuevo empleado "<nombre>" y "<snombre>" y "<apellido>"
    #And sube una foto de perfil "<rutaFoto>"
    Then deberia ver el registro exitoso del empleado "<detalle>"

    Examples:

      | nombre | snombre | apellido | rutaFoto                              | detalle  |
      | Juan   | Marco        | Pérez    | src/test/resources/images/perfil.jpg  | Personal Details |