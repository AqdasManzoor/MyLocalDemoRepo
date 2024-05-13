Feature: First Login

  Scenario: Logo Presence on OrangeHRM home page
     Given User open Orange HRM Home page
     When User Login to the Orange HRM Home page
     And User Click on Leave Left Menu Button
     And User Enter Status on Leave Page
     And User Select Leave Type on Leave Page
     And User Enter their name on Leave Page
     Then Close Browser
