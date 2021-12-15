Feature: Orange HRM

 @Smoke @Regression
  Scenario: verify User should login successfully
    When I enter username "Admin"
    And  I enter password "admin123"
    And  I click on login button
    And  I can see welcome message

 @Sanity @Regression
  Scenario: verify that logo displayed on home page
    When I enter username "Admin"
    And  I enter password "admin123"
    And  I click on login button
    And  I can see orange logo

 @Regression
  Scenario: verify user should logout successfully
    When I enter username "Admin"
    And  I enter password "admin123"
    And  I click on login button
    And I click on welcome
    And I click on logout button
    Then I see a login panel message