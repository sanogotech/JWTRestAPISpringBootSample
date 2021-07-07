Feature: Reusable authentication feature

  Scenario:
    Given url authUrl
	* header Content-Type = 'application/json'
    And request { username: '#(username)', password: '#(password)'}
    When method POST
    Then status 200
    And def accessToken = response.token