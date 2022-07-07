Feature: testing that private endpoint can be reached
  Scenario: client calls GET /private/status
    When client calls "private/status"
    Then client receives a code of 200
    And client receives a body of "OK"