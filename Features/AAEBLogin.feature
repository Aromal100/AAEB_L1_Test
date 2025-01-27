Feature: AAEB login

  Scenario: Checking the AAEB login functionality
    Given user enters AAEB domain page
    And user click on the Login button
    Then user enter the username "admin@tria.plc"
    And click on the submit button
    Then user need to enter the password "school@dmin"
    And click on the continue button
    Then user enters the dsahboard of the AAEB domain
