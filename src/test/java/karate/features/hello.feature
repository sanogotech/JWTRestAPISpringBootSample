Feature: Get Todo

  Background:
    * def signIn = call read('authentication.feature') { username: 'myusername', password: 'password' }
    * def accessToken = signIn.accessToken
    * def resourceUrl = apiBaseUrl + '/hello'


  @nominal
  Scenario: Get  Hello should return 200 status
    # Get Hello
    Given url resourceUrl
    And header Authorization = 'Bearer ' + accessToken
    When method GET
    Then status 200
