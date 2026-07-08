package com.example.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/employees")
public class EmpController {

    @Autowired
    private EmployeeDAO employeeDao;

    @GetMapping("/")
    public Employees getEmployees() {
        return employeeDao.getAllEmployees();
    }

    @PostMapping("/")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        
        //Generate new ID for new employee
        Integer id = employeeDao.getAllEmployees().getEmpList().size() + 1;
        employee.setId(id);

        employeeDao.addEmployee(employee);

        //Build location URI
        URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(employee.getId())
            .toUri();
        
        return ResponseEntity.created(location).build();
    }

}
