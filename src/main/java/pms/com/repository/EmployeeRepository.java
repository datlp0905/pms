package pms.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pms.com.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
