Feature: Purchase in Falabella

  @test @purchase
  Scenario Outline: user Makes a purchase in Falabella
    Given user enters the site
    When user presses the category menu option
    Then user goes to the option "<product>"
    And select "<sub product>"
    Then select the first product displayed
    And select size "<talla>"
    And press the Add to Cart option
    Then press the Go to purchase cart option
    And validates the price of the purchase cart with the previously displayed


    Examples:
      | product   | sub product             |   talla     |
      | Mujer     |  Blusas y poleras       |     L       |
      | Hombre    | Jeans                   |     42      |
      | Mujer     | Pantuflas               |     35      |


