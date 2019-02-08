package praxis.homepractice.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import praxis.homepractice.model.Employee;
import praxis.homepractice.services.EmployeeService;
import praxis.homepractice.util.IdGenerator;

import java.util.List;
import java.util.Objects;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees;
    IdGenerator idGenerator;

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployee(Integer id) {
        return employees.stream().filter(e -> Objects.equals(e.getId(), id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        employee.setId(idGenerator.getNextId());
        employees.add(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(Integer id) {
        employees.removeIf(e -> Objects.equals(e.getId(), id));
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee fromList = getEmployee(employee.getId());
        if(Objects.isNull(fromList))
        return null;

        fromList.setFirstName(employee.getFirstName());
        fromList.setLastName(employee.getLastName());
        fromList.setAge(employee.getAge());
        fromList.setDepartment(employee.getDepartment());

        return fromList;
    }

    @Autowired
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Autowired
    public void setIdGenerator(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }
}

