Feature: Get Hello

  Background:
    * def signIn = call read('../auth/authentication.feature') { username: 'myusername', password: 'password' }
    * def token = signIn.accessToken
    * def resourceUrl = apiBaseUrl + '/hello'


  @nominal
  Scenario: Get  Hello should return 200 status
    # Get Hello
    Given url resourceUrl
    And header Authorization = 'Bearer ' + token
    When method GET
    Then status 200
