package org.fasttrackit.salarii.persistance;

import org.fasttrackit.salarii.domain.Employees;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {

    Page<Employees> findById(long id, Pageable pageable);

    Employees findByMarca(long marca);
}
