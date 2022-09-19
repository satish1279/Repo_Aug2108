Feature: To view all the modules via menu links displayed on Homepage

  Background: 
    Given User is already logged into the application
      | Username                     | Password   |
      | satish.jaiswal@beyond360.com | pass@12345 |

  Scenario: Homepage title
    Given User is on the Homepage
    When Clicks on Survey link
   
