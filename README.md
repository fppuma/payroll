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

- [EmployeeModelAssembler](src/main/java/com/example/payroll/EmployeeModelAssembler.java)
    - Implements RepresentationModelAssembler
      
- [EmployeeController](src/main/java/com/example/payroll/EmployeeController.java)
    - Use Repository methods to display info.
    - one(id) returns EntityModel&lt;Employee&gt;
    - all() returns CollectionModel&lt;EntityModel&lt;Employee&gt;&gt;
    
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

```console
curl localhost:8080/employees
```

Result:
```json
{
    "_embedded": {
        "employeeList": [
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
            },
            {
                "id": 2,
                "name": "Frodo Baggins",
                "role": "thief",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/employees/2"
                    },
                    "employees": {
                        "href": "http://localhost:8080/employees"
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:8080/employees"
        }
    }
}

```
