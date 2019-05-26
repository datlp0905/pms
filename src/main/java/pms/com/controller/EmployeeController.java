package pms.com.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pms.com.entities.Employee;
import pms.com.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    @ApiOperation("Get information of all employee")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation("Get employee by id")
    public Employee findById(@PathVariable(name = "id") String id) {
        return employeeService.findById(id);
    }

    @PostMapping
    @ApiOperation("Create a new employee")
    public Employee create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update information of an employee")
    public Employee update(@PathVariable(name = "id") String id, @RequestBody Employee employee) {
        return employeeService.update(id, employee);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete an employee by id")
    public void delete(@PathVariable(name = "id") String id) {
        employeeService.delete(id);
    }
}
