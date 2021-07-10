Feature: register practice form

  @smokeTest
  Scenario: Full register1

    Given we are on the page
    When fill all the requested data
    Then i can see my data down the form a message in excel


  @smokeTestFaker
  Scenario: Full register2

    Given we are on the page
    When fill all the requested data in faker
    Then i can see my data in down the form in faker

  @smokeTestProperties
  Scenario: Full register3

    Given we are on the page
    When fill all the requested data in properties
    Then i can see my data down the form in properties

