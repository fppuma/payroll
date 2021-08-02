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
    
- [EmployeeNotFoundException](src/main/java/com/example/payroll/EmployeeNotFoundException.java)
    - RuntimeException class for 404 not_found.
    
- [LoadDatabase](src/main/java/com/example/payroll/LoadDatabase.java)
    - Insert records in employee table using CommandLineRunner.