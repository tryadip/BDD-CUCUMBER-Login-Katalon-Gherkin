#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: User mendapatkan inline error pada field email dan password

  @tag1
  Scenario Outline: User klik button login tanpa mengisi semua field
    Given User masuk kehalaman login kumparan
    When User mengklik button login tanpa mengisi semua filed
    And User mengklik button login
    Then user mendapatkan inline <error>

    Examples: 
      | error              |
      | Tidak boleh kosong |
