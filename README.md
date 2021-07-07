https://www.javainuse.com/spring/boot-jwt


## Karate

To run all the tests ( they are all under karate), run
```
$ mvn test -Dtest=KarateTests
```
To run only the tests under the karate/hello, run
```
$ mvn test -Dtest=HelloRunner
```
mvn clean test -DargLine="-Dkarate.env=local" -Dtest=FeatureRunner 

##  1. Swagger
http://localhost:8080/swagger-ui.html

##  1.  POST/Request  JWT Token

HTTP POST :  localhost:8080/authenticate

Header /Content-Type  : application/json

* RAW Type Request:

{
    "username": "myusername",
    "password": "password"
}

EX: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJteXVzZXJuYW1lIiwiZXhwIjoxNjI1NjkwOTM3LCJpYXQiOjE2MjU2NzI5Mzd9.ICiTleSw8YO3OVqqv2N1y33gHX52ZiurAWtKzkQia7WtA-JD1THZ84L4BMLg2CrQkwcaUbqcREMfAgh5BJup8w

## 2. Get Message with Auth JWT
HTTP  GET:  http://localhost:8080/hello
Header /Authorization :  Bearer  eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE1ODcwNjQ4NzMsImlhdCI6MTU4NzA0Njg3M30.AY2SmNipkRb7ChirefcsDorcuaYXMi9VUopX0RJShQv1v8mctZK0gOVa8wEaIjKVXmRkphiJM6RStrvA1OJq3w 
 
 
 Response:
 
 Hello World
## Application.properties
jwt.secret=mysecretkey

jwt.get.token.uri=/authenticate
