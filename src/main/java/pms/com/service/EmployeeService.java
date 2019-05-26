package pms.com.service;

import org.springframework.stereotype.Service;
import pms.com.entities.Employee;

import java.util.List;

@Service
public interface EmployeeService {
    public List<Employee> getAll();
    public Employee findById(String id);
    public Employee create(Employee e);
    public Employee update(String id, Employee e);
    public void delete(String id);
}
