package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
    private static Employees employees = new Employees();

    static {
        //sample employees
        employees.getEmpList()
            .add(new Employee(1, "Graham", "Robert", "gqr@gmail.com"));
        employees.getEmpList()
            .add(new Employee(2, "Smith", "John", "jsmith@gmail.com"));
        employees.getEmpList()
            .add(new Employee(3, "Rajesh", "Cootherpally", "rcootherpally@gmail.com"));
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmpList().add(employee);
    }
}
