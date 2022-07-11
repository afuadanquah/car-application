Feature: testing that private endpoint can be reached
  Scenario: client calls GET /private/status
    When The client calls "private/status"
    Then The client receives a code of 200
    And The client receives a body of "OK"