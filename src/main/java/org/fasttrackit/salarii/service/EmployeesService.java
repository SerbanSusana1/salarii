package org.fasttrackit.salarii.service;

import org.fasttrackit.salarii.domain.Employees;
import org.fasttrackit.salarii.exception.ResourceNotFoundException;
import org.fasttrackit.salarii.persistance.EmployeesRepository;
import org.fasttrackit.salarii.transfer.Employees.SaveEmployeesRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeesService.class);

    private final EmployeesRepository employeesRepository;

    @Autowired
    public EmployeesService(EmployeesRepository employeesRepository) {

        this.employeesRepository = employeesRepository;
    }

    public Employees createEmployees(SaveEmployeesRequest request) {
        LOGGER.info("Create employees :", request);
        Employees employees = new Employees();
        employees.setFirstName(request.getFirstName());
        employees.setLastName(request.getLastName());
        employees.setMarca(request.getMarca());
        employees.setSalary(request.getSalary());
        employees.setStandardHours(request.getStandardHours());
        employees.setPersonalDeduction(request.getPersonalDeduction());
        employees.setTiket(request.getTiket());
        return employeesRepository.save(employees);

    }

    public Employees getEmployees(long id) {
        LOGGER.info("Retrieving employees : {}", id);
        return employeesRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employees" + id + "not found"));
    }

    public Employees updateEmployees(long id, SaveEmployeesRequest request) {
        LOGGER.info("Update employees {}: {}", id, request);

        Employees employees = getEmployees(id);
        BeanUtils.copyProperties(request, employees);
        return employeesRepository.save(employees);
    }

    public void deleteEmployees(long id) {
        LOGGER.info("Delete employees : {}", id);
        employeesRepository.deleteById(id);
    }

}
