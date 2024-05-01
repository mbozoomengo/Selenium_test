Feature: Account User
  Scenario: Connection to the account with correct credentials
    Given the user is on the homepage
    When the user clicks on the avatar in the navbar
    And the user enters their login
    And the user enters their password
    And the user clicks on the login button
    Then the connection should be established successfully and the test should end
