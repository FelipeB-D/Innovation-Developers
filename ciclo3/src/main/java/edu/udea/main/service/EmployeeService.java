package edu.udea.main.service;

import edu.udea.main.model.Employee;
import edu.udea.main.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> lookEmployee(){
        List<Employee> employees = new ArrayList<Employee>();
        employees.addAll(employeeRepository.findAll());
        return employees;

    }
    public void makeEmployee(Employee employee){
        employeeRepository.save(employee);

    }
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

}
