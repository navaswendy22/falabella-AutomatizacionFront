Feature: Register a user in Falabella and login


  @test @register
  Scenario Outline: Register a user in Falabella
    Given user enters the site
    When  user enters to sign up
    And start filling in form entering name "<name>"
    And enter last name "<lastName>"
    And enter rut "<rut>"
    And enter phone number "<phone>"
    And enter email "<email>"
    And enter password "<password>"
    And press register button
    Then validate that the "<name>" matches the entered account

    Examples:
      | name    | lastName   | rut       | phone    | email          | password           |
      | Maria   | Jimenez    | 52884446  | 65330807 | mariajimenez   | MariaJimenez451.   |



  @test @login
  Scenario Outline: Log in with a user
    Given user enters the site
    When user enters to sign in
    And enter mail "<email>"
    And enter password "<password>"
    And press enters button
    Then validate that the "<name>" matches the entered account

    Examples:
       | email                         | password         |  name |
       | mariajimenez2461@yopmail.com | MariaJimenez451.   | Maria   |

