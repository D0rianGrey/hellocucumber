Feature: Application login
  Scenario: Home page default login
    Given User is NetBanking landing page
    When User login into application with username and password
    Then Home page is populated
    And Cards are displayed