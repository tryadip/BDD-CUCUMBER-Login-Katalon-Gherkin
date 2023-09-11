#Author: your.email@your.domain.com
@tag
Feature: user mendapatkan inline error saat mengisi invalid email

  @tag1
  Scenario Outline: User login dengan invalid email
    Given user berhasil masuk kedalam halaman login
    When user input dengan invalid <email> dan <password> yang valid
    And user mengklik button masuk pada halaman login
    Then user mendapatkan <error> invalid pada field email

    Examples: 
      | email           | password | error                           |
      | tryadi@gmailcom |    12345443 | Harus diisi dengan format email |
      | tryadigmail.com |    123454343 | Harus diisi dengan format email |
