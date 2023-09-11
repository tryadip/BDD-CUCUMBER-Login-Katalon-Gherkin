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
Feature: User mendapatkan infomasi error berupa inline error pada field email

  @tag1
  Scenario Outline: user login tanpa menginput field email
    Given User diarahkan kehalaman login
    When user hanya menginput field <password>
    And user mengklik tombol masuk
    Then user menerima informasi berupa inline <error> pada field email

    Examples: 
      | password    | error              |
      | Abcadadw123 | Tidak boleh kosong |
