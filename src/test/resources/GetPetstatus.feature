Feature: Validate pets with status set as available and name doggie

  Scenario: validate status
    Given I request pet information from the API
     When I request for the number of available pets with status "Available"
    Then I receive a response with the number of pets with statuses  "Available"


    Scenario: validate name doggie
      Given I request pet information from the API
      When I request for name of pets available
      Then I receive a response with the number of pets
      And The name of the pet  should be "doggie"