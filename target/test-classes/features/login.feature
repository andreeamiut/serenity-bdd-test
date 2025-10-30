Feature: Admin Login

  Scenario: Successful admin login
    Given I am on the Magento admin login page
    When I enter username "magebit" and password "Demo123"
    And I click the login button
    Then I should be logged in to the admin dashboard

  Scenario: Invalid login attempt
    Given I am on the Magento admin login page
    When I enter username "invalid" and password "wrong"
    And I click the login button
    Then I should see an error message