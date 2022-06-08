package ru.ivos.rest_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ivos.rest_backend.models.Employee;

/**
 * @author iVos 31.05.2022
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
