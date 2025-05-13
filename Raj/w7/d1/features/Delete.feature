Feature: Delete a Lead in CRM

  Scenario Outline: Login and delete a lead using phone and first name
    
    When I login with username "<username>"
    And password "<password>"
    And I click the login submit button
    And I navigate to crm
    And I click on lead button
    And I click on FindLead lead 
    And I click on the Name and ID tab
    And I enter in the first name field "<firstName>"
    And I click on Find Leads button
    Then I should see the first lead in the result list
    When I click on the first lead named "<firstName>"
    And I click the Delete button
    Then the lead should be deleted successfully

  Examples:
    | username         | password | firstName |
    | DemoSalesManager | crmsfa   | Saranya   |