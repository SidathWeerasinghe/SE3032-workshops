```
http://localhost:8080/myself
```

```
curl --location --request GET 'http://localhost:8080/getEmployees' \
--data-raw ''
```

```
curl --location --request POST 'http://localhost:8080/addEmployee' \
--header 'Content-Type: application/json' \
--data-raw '{
"firstName" : "aaaa",
"lastName" : "bbbbb",
"email" : "ccc"
}'
```
