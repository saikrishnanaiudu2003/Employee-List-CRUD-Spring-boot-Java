package com.example.employee;

import java.util.*;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();

    Employee addEmployees(Employee employee);

    Employee getEmployeeById(int employeeId);

    Employee addEmployeesById(int employeeId, Employee employee);

    void deleteById(int employeeId);
}