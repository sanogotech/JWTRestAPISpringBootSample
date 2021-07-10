Feature: Reusable authentication feature

 Background:
    # Please keep white space around the = sign:
    * def authdata =  read('classpath:authdata.json')

  Scenario:
    Given url authUrl
	* header Content-Type = 'application/json'
    #And request { username: '#(username)', password: '#(password)'}
    And request authdata
    When method POST
    Then status 200
    And def accessToken = response.token
    And print "Le token est:",accessToken