#Author: tryadip@gmail.com

@tag
Feature: User mendapatkan infomasi error berupa inline error pada field email

  @tag1
  Scenario Outline: User login tanpa menginput field password
    Given User berhasil masuk ke halaman login
    When User hanya input field <email>
    And User mengklik button masuk
    Then User menerima informasi <error> berupa inline error pada field password

    Examples: 
      | email                 | error              |
      | danawjnwdaj@gmail.com | Tidak boleh kosong |
      | dadadada@gmail.com    | Tidak boleh kosong |
