Feature: Title of your feature

  Scenario: Title of your scenario
    Given url "https://reqres.in/api/users"
    When method GET
    #And some other action
    #And yet another action
    Then status 200
    #And check more outcomes
    #And match $ == {id:"1234",name:"John Smith"}
    #And match $ contains {id:"1234"}
    #And match $.id == "1234"
    #‘$' represents the response
