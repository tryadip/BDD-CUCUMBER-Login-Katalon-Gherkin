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
Feature: User mendapatkan inline error email atau password salah ketika user mengisi field password dan email

  @tag1
  Scenario Outline: user menginput data invalid password atau email
    Given user berhasil masuk ke halaman login
    When User mengisi field <email> atau <password> dengan data invalid
    And User mengklik button masuk login web kumparan
    Then user mendapatkan <error> pada field email dan password

    Examples: 
      | email                | password | error                     |
      | mugupugu1@gmail.com  | Mau14    | Email atau Password Salah |
      | mugupugu14@gmail.com | Maumau14 | Email atau Password Salah |
