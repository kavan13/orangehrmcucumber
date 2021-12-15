Feature: Orange HRM
  As a user i can operate orange hrm website

  Background: User is om homepage

  @Smoke @Regression
  Scenario: admin should add user successfully
    When I enter username "Admin"
    And  I enter password "admin123"
    And  I click on login button
    And  I click on admin tab
    And I click on add button
    Then I can see Add User text
    And  I select user role "0"
    And  I enter employee name "Ananya Dash"
    And  I enter my username "name"
    And  I select status "0"
    And  I set password "Abcd123@"
    And  I set confirm password "Abcd123@"
    And  I click on save button

  @Sanity @Regression
  Scenario: Search the user created and verify it
    When I enter username "Admin"
    And  I enter password "admin123"
    And  I click on login button
    And  I click on admin tab
    And I click on add button
    Then I can see Add User text
    And  I select user role "0"
    And  I enter employee name "Ananya Dash"
    And  I enter my username "name"
    And  I select status "0"
    And  I set password "Abcd123@"
    And  I set confirm password "Abcd123@"
    And  I click on save button
    And  I enter name in search field "name"
    And  I select user roll drop down "1"
    And  I enter status as "2"
    And I click to search
    Then i can see user is in result list

  @Regression
  Scenario: verify that admin should delete the user successfully
    When I enter username "Admin"
    And  I enter password "admin123"
    And  I click on login button
    And  I click on admin tab
    And I click on add button
    Then I can see Add User text
    And  I select user role "0"
    And  I enter employee name "Ananya Dash"
    And  I enter my username "name"
    And  I select status "0"
    And  I set password "Abcd123@"
    And  I set confirm password "Abcd123@"
    And  I click on save button
    And  I enter name in search field "name"
    And  I select user roll drop down "1"
    And  I enter status as "2"
    And I click to search
    And  I marked in check box
    And  I click on delete button
    And  I click on pop up

  @Smoke
  Scenario: Search the deleted user and verify the message no record found
    When I enter username "Admin"
    And  I enter password "admin123"
    And  I click on login button
    And  I click on admin tab
    And  I enter a user name "Kavan132"
    And  I set his role "1"
    And  I set his status "2"
    And  I click to search
    And  I can see no record found