package com.example.employee;

import com.example.employee.Employee;
import com.example.employee.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    public Employee addEmployees(@RequestBody Employee employee) {
        return employeeService.addEmployees(employee);
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee addEmployeesById(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee) {
        return employeeService.addEmployeesById(employeeId, employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteById(@PathVariable("employeeId") int employeeId) {
        employeeService.deleteById(employeeId);
    }

}