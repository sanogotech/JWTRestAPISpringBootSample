Feature: Login and register Tests on reqres.in

  Background: 
    * def urlBase = 'https://reqres.in'
    * def loginPath = '/api/login'
    #* def requestAuthJson = read('requestAuth.json')
    * def myJson = { foo: 'bar', baz: [1, 2, 3] }
    * print 'the value of myJson sample is:', myJson

  Scenario Outline: As a <description>, I want to get the corresponding response_code <status_code>
    Given url  urlBase + loginPath
    And request { 'email': <username> , 'password': <password> }
    #And request  requestAuthJson
    When method POST
    * print response
    Then status <status_code>
    #And match $ contains {id:"#notnull"}
    #And match $ contains {token:"#string"}
    #And match response == read('expected-response-payload.json')
    # Doc: https://github.com/intuit/karate#embedded-expressions
    # Doc: https://github.com/intuit/karate#scenario-outline-enhancements
    # json
    # * def someJson = read('some-json.json')
    # * def moreJson = read('classpath:more-json.json')

    Examples: 
      | username             | password     | status_code | description  |
      | 'eve.holt@reqres.in' | 'cityslicka' |         200 | valid user   |
      | 'eve.holt@reqres.in' | null         |         400 | invalid user |
