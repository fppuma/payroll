# payroll
[Spring Restful Tutorial](https://spring.io/guides/tutorials/rest/)

# Getting started
[Spring Initializr](https://start.spring.io/)
- Web
- JPA
- H2

# Classes
- [Employee](src/main/java/com/example/payroll/Employee.java)
    - Entity Class.
  
- [EmployeeRepository](src/main/java/com/example/payroll/EmployeeRepository.java)
    - Interface that extends JpaRepository.
  
- [EmployeeController](src/main/java/com/example/payroll/EmployeeController.java)
    - Use Repository methods to display info.
    - one(id) returns EntityModel&lt;Employee&gt;
    
- [EmployeeNotFoundException](src/main/java/com/example/payroll/EmployeeNotFoundException.java)
    - RuntimeException class for 404 not_found.

- [EmployeeNotFoundAdvice](src/main/java/com/example/payroll/EmployeeNotFoundAdvice.java)
    - Using @ControllerAdvice annotation it returns 404 status for the EmployeeNotFoundException
        
- [LoadDatabase](src/main/java/com/example/payroll/LoadDatabase.java)
    - Insert records in employee table using CommandLineRunner.
    
## In Windows
```console
curl -X POST localhost:8080/employees -H "Content-type:application/json" -d "{\"name\": \"Samwise Gamgee\", \"role\": \"gardener\"}"
```

## HATEOAS
```console
curl localhost:8080/employees/1
```

Result:

```json
{
    "id": 1,
    "name": "Bilbo Baggins",
    "role": "burglar",
    "_links": {
        "self": {
            "href": "http://localhost:8080/employees/1"
        },
        "employees": {
            "href": "http://localhost:8080/employees"
        }
    }
}

```

