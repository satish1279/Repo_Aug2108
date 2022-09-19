Feature: To test the Login feature

  Scenario: User logged in successfully and remains on Homepage
    Given User is on Login Page
    When User enters correct credentials
      | UserName            | Password   |
      | aman71165@gmail.com | pass@1234 |
    And Clicks on Login button
    Then landing page title should be - Home
