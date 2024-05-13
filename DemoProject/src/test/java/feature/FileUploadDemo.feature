Feature: File Upload Demo

  Scenario: File Upload through robot class
    Given User open Demo QA Home page
    When User clicks on Choose File Button
    And User upload file by clicking on choose file Button
    Then User verify the file is successfully upload
    And Close Browser

  Scenario: robot class functions
    Given User open Demo QA Tutorial site
    When User can take screenShot of website
    And User can Scroll website
    Then Close Browser

  Scenario: Action Class right click functions practice
    Given User open Demo Context Menu Website
    When User can right click on button
    And User select dropdown list option
    And User verify that the option is selected
    Then Close Browser

  Scenario: Action Class drag and drop functions practice
    Given User open Drag And Drop Website
    When User can drag and drop
    Then Close Browser

