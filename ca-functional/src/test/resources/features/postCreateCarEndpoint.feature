Feature: testing that a client can add a car to the database
  Scenario: client calls POST /car/create
    When The client calls "car/create"
    Then The client receives a code of 200
#    And The client receives a body message of "Car added successfully"