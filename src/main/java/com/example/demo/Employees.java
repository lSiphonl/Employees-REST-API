package com.example.demo;

import java.util.ArrayList;
import java.util.List;

//Storage class for Employee objects
public class Employees {
    private List<Employee> empList;

    //get emp list - init if null
    public List<Employee> getEmpList() {
        if (empList == null) { 
            empList = new ArrayList<>();
        }
        return empList;
    }
}
