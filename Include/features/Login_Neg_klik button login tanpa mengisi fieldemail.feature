#Author: Tryadip@gmail.com

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
