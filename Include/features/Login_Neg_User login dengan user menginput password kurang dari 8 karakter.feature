#Author: your.email@your.domain.com

@tag
Feature: user mendapatkan error inline password kurang dari 8 karakter

  @tag1
  Scenario Outline: User menginput field password kurang dari 8 karakter
    Given user diarahkan kehalaman login kumparan
    When user menginput field <email> dengan data valid dan field <password> kurang dari 8 karakter
    And User klik button login pada menu login kumparan
    Then User mendapatkan error pada field passwor berupa inline <error>

    Examples: 
      | email            | password | error              |
      | tryadi@gmail.com |    12345 | Minimal 8 karakter |
      | tryadi@gmail.com |    12345 | Minimal 8 karakter |
