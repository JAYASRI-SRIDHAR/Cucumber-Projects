Feature: Login Functionality OrangeHrm
  

Scenario: Checking the logo of OrangeHm on homepage
    Given I launch chrome browser 
    When open OrangeHrm homepage
    Then I verify that the logo is present on the page
    And close the browser

  