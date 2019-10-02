package org.fasttrackit.salarii.persistance;

import org.fasttrackit.salarii.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
}
