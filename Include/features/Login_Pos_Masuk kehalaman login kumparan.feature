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
Feature: User berhasil kehalaman login kumparan

  @tag1
  Scenario Outline: User masuk kehalaman login kumparan
    Given User mencari website kumparan melalui <url>
    When User klik button masuk
    Then user masuk kehalaman login kumparan

    Examples: 
      | url  |
      | https://kumparan.com/ |