package edu.udea.main.controller;

import edu.udea.main.model.Employee;
import edu.udea.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employee")
    private List<Employee> lookEmployee(){
        return employeeService.lookEmployee();
    }
    @PostMapping("/employee")
    private void makeEmployee(@RequestBody Employee employee){
        employeeService.makeEmployee(employee);
    }
    @DeleteMapping("/employee/{id}")
    private void deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }
}
