https://www.javainuse.com/spring/boot-jwt


##  1.  POST/Request  JWT Token

HTTP POST :  localhost:8080/authenticate

Header /Content-Type  : application/json

* RAW Type Request:

{
    "username": "myusername",
    "password": "password"
}

## 2. Get Message with Auth JWT
HTTP  GET:  http://localhost:8080/hello
Header /Authorization :  Bearer  eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE1ODcwNjQ4NzMsImlhdCI6MTU4NzA0Njg3M30.AY2SmNipkRb7ChirefcsDorcuaYXMi9VUopX0RJShQv1v8mctZK0gOVa8wEaIjKVXmRkphiJM6RStrvA1OJq3w 
 
 
 Response:
 
 Hello World
## Application.properties
jwt.secret=mysecretkey

jwt.get.token.uri=/authenticate
