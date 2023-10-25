# springboot-jwt-mysql
--------------------------------







# Client ---> [ Request(userName+Password) ] ----> POST /auth/login
# Client <--- [ Response(+accessToken) ] <---- POST /auth/login

# Client ---> [ Request(+accessToken) ] ----> GET /products
# Client ---> [ Response(+JSON) ] ----> GET /products






# Note: before execute login API please run Test SpringbootJwtMysqlApplicationTests class

# Login API:
-----------
http method type: POST
url: http://localhost:8080/auth/login
headers: 
Content-Type : application/json
body:
{
    "email" : "m@gmail.com",
    "password" : "mtr321"
}




# Product API:
-----------
http method type: POST
url: http://localhost:8080/products
headers: 
Content-Type : application/json

Auth:
Bearer Token: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIzLG1AZ21haWwuY29tIiwiaXNzIjoibXRyIiwiaWF0IjoxNjk4MTkzMTk3LCJleHAiOjE2OTgyNzk1OTd9.i2d3VEonimRSsJ7DKJbiRn98j1Xy6giLpQoejFPh1cHskZrBojmdDUNmc3uLdDBdQYZ26xVE7-g-ugSlgQgDFw

body:
{
    "name" : "iPhone 13 Pro",
    "price" : "1000"
    }










