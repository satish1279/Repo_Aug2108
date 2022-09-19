Feature: To check screenshot functionality

  Scenario Outline: Verify if screenshot is being captured
    Given user is on ssLogin page
    When user enters <ssUsername> and <ssPassword>
    And user click on ssLogin button
    Then User navigates to ssHomepage

    Examples: 
      | ssUsername                   | ssPassword |
      | satish.jaiswal@beyond360.com | pass@1234  |
