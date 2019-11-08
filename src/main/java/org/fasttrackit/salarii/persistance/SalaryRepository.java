package org.fasttrackit.salarii.persistance;

import org.fasttrackit.salarii.domain.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
