Feature: Open the TrustnetDirect and click login

  Scenario: Open the TrustnetDirect and click login
    Given Open the TrustnetDirect Website
    When Click the Login button
    Then User able to see the Login Popup


  Scenario: Open the TrustnetDirect and Enter Username Password
    Given Open the TrustnetDirect Website
    When Click the Login button
    And User able to see the Login Popup
    Then Enter the "babulive21" and "Fedby123#"


  Scenario: Open the TrustnetDirect and verify Login
    Given Open the TrustnetDirect Website
    And Click the Login button
    And User able to see the Login Popup
    When Enter the "babulive21" and "Fedby123#"
    And Click the Loginpopup Login button
    Then User logged in Succesfully

  @done
  Scenario Outline: Open the TrustnetDirect and verify different Logins
    Given Open the TrustnetDirect Website
    And Click the Login button
    And User able to see the Login Popup
    When Enter the "<Username>" and "<Password>"
    And Click the Loginpopup Login button
    Then User logged in Succesfully
    Examples:
      |Username  | Password   | logged |
      |babuqa21|  Fedby123# | BABU.. BABU..      |
      |laurahenn |  Password1 | babu.. babu..      |
