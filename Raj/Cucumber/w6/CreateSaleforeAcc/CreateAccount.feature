Feature: Create Salesforce Account

 Scenario: Create a new account in Salesforce

Given Launch the salesforce page 
And enter with username 'bhuvanesh.moorthy@testleaf.com'
And  Enter the password 'Testleaf@2025'
When I Click on toggle menu button from the left corner
And I Click view All and click Sales from App Launcher
And Click on Accounts tab
And I click on New button
And I enter 'Raj' as the account name
And I select Ownership as Public
Then I click save and verify Account name is 'Raj'