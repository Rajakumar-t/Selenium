Feature: Create Lead in LeafTaps

 Scenario Outline: Create a new lead with valid details
    When I enter the username as "<username>"
    And I enter the password as "<password>"
    And I click on the Login button
    And I click on CRM/SFA link
    And I click on Leads tab
    And I click on Create Lead option
    And I enter company name "<companyName>"
    And I enter first name "<firstName>"
    And I enter last name "<lastName>"
    And I click on the Create Lead button
    Then The lead should be created and View Lead page should be displayed
		
		Examples:
      | username        | password | companyName | firstName | lastName  |
      | Demosalesmanager | crmsfa   | TestLeaf    | Vineeth   | Rajendran |