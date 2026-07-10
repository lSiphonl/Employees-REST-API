package com.example.demo;

import java.util.ArrayList;
import java.util.List;

//Storage class for Employee objects
public class Employees {
    private List<Employee> employees;

    //get emp list - init if null
    public List<Employee> getEmpList() {
        if (employees == null) { 
            employees = new ArrayList<>();
        }
        return employees;
    }

    public void setEmpList(List<Employee> empList) {
        this.employees = empList;
    }
}
