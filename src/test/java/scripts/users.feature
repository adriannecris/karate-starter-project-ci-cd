Feature: test

  Background:
    * url 'https://reqres.in/'

    Scenario: asd
      Given path 'api/users'
      And param page = 2
      When method get
      Then match response.page == 3