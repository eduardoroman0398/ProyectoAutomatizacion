@Demo-auto
Feature: Test Demo Automation

  Scenario Outline: Proyecto Allocation
    Given Ingresar la url del ambiente <ambiente>, <estable>
    And Ingresamos <usuario>, <contrasena>
    And Seleccionamos Generate Token
    And seleccionamos el idioma <idioma>
    And seleccionamos el perfil <perfil>
    And hacemos click en menu hamburguesa principal
    And seleccionamos la opcion <modulo>
    And seleccionamos la subopcion <subopcion>
    And cerramos el menu intelica
    And clickeamos en el menu hamburguesa secundario
    And seleccionamos la accion Filters <opcionfiltro>
    #And seleccionamos MTU <MTU>
    Examples:
      | ambiente | estable | usuario                    | contrasena | idioma | perfil                      | modulo       | subopcion        | opcionfiltro         | MTU   |
      | QA       | no      | eduardo.roman@intelica.com | depapym    | ENG    | Intelica - Development Team | Internal Use | Special Criteria | New special criteria | Count |

