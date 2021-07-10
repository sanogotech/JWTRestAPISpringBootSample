Feature: Get Hello

  Background:
    #* def signIn = call read('../../authentication.feature') { username: 'myusername', password: 'password' }
    #* def token = signIn.accessToken
    * def token = fullAuthInfos.accessToken
    * def resourceUrl = apiBaseUrl


  @nominal
  Scenario: Get  Hello should return 200 status
    # Get Hello
    Given url resourceUrl +'/hello'
    And header Authorization = 'Bearer ' + token
    When method GET
    Then status 200
	
	
	
	
  @nominal
  Scenario: Get  badHello should return 404 status
    # Get badHello
    Given url resourceUrl +'/badhello'
    And header Authorization = 'Bearer ' + token
    When method GET
    Then status 404
