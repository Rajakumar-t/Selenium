Feature: Edit Lead in LeafTaps

  Scenario Outline: Edit the company name of a lead using phone number search
    When I enter the username as "<username>"
    And I enter the password as "<password>"
    And I click on the Login button
    And I click on CRM/SFA link
    And I click on Find Leads
    And I click on the Phone tab
    And I enter phone number "<phoneNumber>"
    And I click on the Find Leads button
    And I select the first resulting lead
    And I click on Edit lead
    And I update the company name to "<newCompanyName>"
    And I click on the Update button
    Then The lead's company name should be updated successfully

    Examples:
      | username        | password | companyName | firstName | lastName  |phoneNumber | newCompanyName |
      | Demosalesmanager | crmsfa   | TestLeaf    | Vineeth   | Rajendran | 99        | TCS            |      