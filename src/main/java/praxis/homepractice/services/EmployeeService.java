package praxis.homepractice.services;

import praxis.homepractice.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee getEmployee(Integer id);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(Integer id);

    Employee updateEmployee(Employee employee);

}
