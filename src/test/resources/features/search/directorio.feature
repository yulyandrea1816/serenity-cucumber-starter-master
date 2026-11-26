@all
Feature: Búsqueda y validación de empleados en el módulo Directorio

  Background:
    Given "User" abre la página web
    And Credenciales "Admin" y "admin123"

  @BuscarEmpleadoDirectorio
  Scenario Outline: Buscar un empleado por nombre y validar su información básica
    When navega al modulo de Directory
    And realiza una busqueda por el filtro de nombre de empleado "<nombreCompleto>"
    Then valida que la información basica del empleado "<nombreCompleto>" y ubicación "<ubicacion>"

    Examples:

      | nombreCompleto    | ubicacion        |
      | Juan Carlos Pérez | Texas R&D        |