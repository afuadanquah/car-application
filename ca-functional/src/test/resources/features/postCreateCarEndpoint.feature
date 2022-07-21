Feature: testing that a client can add a car to the database
  Scenario: client calls POST /car/create
    When The client makes a call "car/create"
    Then The client receives code of 200
#    And The client receives body of "OK"